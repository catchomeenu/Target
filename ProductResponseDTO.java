package com.target.oprations.retail.response.productResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by msutar on 8/15/16.
 */
public class ProductResponseDTO {

    @SerializedName("product_composite_response")
    @Expose
    private ProductCompositeResponse productCompositeResponse;

    /**
     * @return The productCompositeResponse
     */
    public ProductCompositeResponse getProductCompositeResponse() {
        return productCompositeResponse;
    }

    /**
     * @param productCompositeResponse The product_composite_response
     */
    public void setProductCompositeResponse(ProductCompositeResponse productCompositeResponse) {
        this.productCompositeResponse = productCompositeResponse;

    }

}
