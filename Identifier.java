package com.target.oprations.retail.response.productResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by msutar on 8/15/16.
 */
public class Identifier {


    @SerializedName("id_type")
    @Expose
    private String idType;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("is_primary")
    @Expose
    private Object isPrimary;
    @SerializedName("source")
    @Expose
    private String source;

    /**
     *
     * @return
     * The idType
     */
    public String getIdType() {
        return idType;
    }

    /**
     *
     * @param idType
     * The id_type
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The isPrimary
     */
    public Object getIsPrimary() {
        return isPrimary;
    }

    /**
     *
     * @param isPrimary
     * The is_primary
     */
    public void setIsPrimary(Object isPrimary) {
        this.isPrimary = isPrimary;
    }

    /**
     *
     * @return
     * The source
     */
    public String getSource() {
        return source;
    }

    /**
     *
     * @param source
     * The source
     */
    public void setSource(String source) {
        this.source = source;
    }

}