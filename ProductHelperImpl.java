package com.target.oprations.retail.helper.impl;

import com.target.oprations.retail.client.ProductClient;
import com.target.oprations.retail.dao.ProductDao;
import com.target.oprations.retail.dao.ProductPriceDao;
import com.target.oprations.retail.helper.ProductHelper;
import com.target.oprations.retail.nocql.entity.ProductPriceDO;
import com.target.oprations.retail.nocql.repository.ProductPriceRepository;
import com.target.oprations.retail.response.productResponse.Identifier;
import com.target.oprations.retail.response.productResponse.Item;
import com.target.oprations.retail.response.productResponse.ProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by msutar on 8/15/16.
 */
@Component
public class ProductHelperImpl implements ProductHelper{

    @Autowired
    private ProductPriceRepository productPriceRepository;

    @Autowired
    private ProductClient productClient;


    public ProductDao getProductDetails(String productID) throws Exception {

        ProductDao productDao= null;
        try{

            productDao = getProductApiDetails(productID);

        }catch (Exception e){
            throw new Exception("Exception ossured while getting Product Details"+e.getMessage());
        }
        return productDao;

    }

    private  ProductDao getProductApiDetails(String productID) throws Exception{
        ProductDao productDao ;
        try {

            ProductResponseDTO productResponseDTO = productClient.getProductDetails(productID);
            Item item = productResponseDTO.getProductCompositeResponse().getItems().get(0);
            productDao = new ProductDao();

            productDao.setName(item.getOnlineDescription().getValue());

            List<Identifier> identifierList = item.getIdentifier();
            for(Identifier identifier:identifierList){
                if(identifier.getIdType().equalsIgnoreCase("TCIN")){
                    productDao.setId(identifier.getId());
                }
            }

            //get it from DB
            ProductPriceDao productPriceDao = getProductPriceDetails(productID);
            productDao.setCurrent_price(productPriceDao);

        }catch(Exception e){
            throw new Exception("Exception while getting productAPI Dettails"+e.getMessage());
        }
        return productDao;
    }

    private ProductPriceDao getProductPriceDetails(String productID) throws Exception{

        ProductPriceDO productPriceDO =  productPriceRepository.fetchById(Integer.parseInt(productID));
        ProductPriceDao productPriceDao = new ProductPriceDao();

        productPriceDao.setValue(productPriceDO.getPrice());
        productPriceDao.setCurrency_code(productPriceDO.getCurrency_code());

        return productPriceDao;
    }



}

