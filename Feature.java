package com.target.oprations.retail.response.productResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by msutar on 8/15/16.
 */
public class Feature {


    @SerializedName("feature")
    @Expose
    private String feature;

    /**
     * @return The feature
     */
    public String getFeature() {
        return feature;
    }

    /**
     * @param feature The feature
     */
    public void setFeature(String feature) {
        this.feature = feature;
    }
}