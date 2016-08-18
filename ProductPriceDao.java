package com.target.oprations.retail.dao;

import org.springframework.stereotype.Component;

/**
 * Created by msutar on 8/15/16.
 */

public class ProductPriceDao {

    private double value;
    private String currency_code;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }
}
