package com.target.oprations.retail.nocql.repository;

import com.target.oprations.retail.nocql.entity.ProductPriceDO;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by msutar on 8/17/16.
 */
@Component
public interface ProductPriceRepository extends CrudRepository<ProductPriceDO,String> {

    @Query("Select * from product_price where productId=?0")
    public ProductPriceDO fetchById(int id);
}