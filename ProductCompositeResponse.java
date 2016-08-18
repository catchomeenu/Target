package com.target.oprations.retail.response.productResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by msutar on 8/15/16.
 */
public class ProductCompositeResponse {


    @SerializedName("request_attributes")
    @Expose
    private List<RequestAttribute> requestAttributes = new ArrayList<RequestAttribute>();
    @SerializedName("items")
    @Expose
    private List<Item> items = new ArrayList<Item>();

    /**
     *
     * @return
     * The requestAttributes
     */
    public List<RequestAttribute> getRequestAttributes() {
        return requestAttributes;
    }

    /**
     *
     * @param requestAttributes
     * The request_attributes
     */
    public void setRequestAttributes(List<RequestAttribute> requestAttributes) {
        this.requestAttributes = requestAttributes;
    }

    /**
     *
     * @return
     * The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     *
     * @param items
     * The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }
}
