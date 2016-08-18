package com.target.oprations.retail.helper;

import com.target.oprations.retail.dao.ProductDao;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by msutar on 8/15/16.
 */

public interface ProductHelper {

    public ProductDao getProductDetails(String productID) throws Exception;

}
