package com.target.oprations.retail.dao;

import org.springframework.stereotype.Component;

/**
 * Created by msutar on 8/15/16.
 */

public class ProductDao {

    private String id;
    private String name;
    private ProductPriceDao current_price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductPriceDao getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(ProductPriceDao current_price) {
        this.current_price = current_price;
    }
}
