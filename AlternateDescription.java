package com.target.oprations.retail.response.productResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by msutar on 8/15/16.
 */
public class AlternateDescription {


    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("type_description")
    @Expose
    private String typeDescription;

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The value
     */
    public String getValue() {
        return value;
    }

    /**
     *
     * @param value
     * The value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     *
     * @return
     * The typeDescription
     */
    public String getTypeDescription() {
        return typeDescription;
    }

    /**
     *
     * @param typeDescription
     * The type_description
     */
    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

}
