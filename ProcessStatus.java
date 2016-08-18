package com.target.oprations.retail.response.productResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by msutar on 8/15/16.
 */
public class ProcessStatus {


    @SerializedName("is_ready")
    @Expose
    private Boolean isReady;
    @SerializedName("operation_description")
    @Expose
    private String operationDescription;
    @SerializedName("operation_code")
    @Expose
    private String operationCode;

    /**
     *
     * @return
     * The isReady
     */
    public Boolean getIsReady() {
        return isReady;
    }

    /**
     *
     * @param isReady
     * The is_ready
     */
    public void setIsReady(Boolean isReady) {
        this.isReady = isReady;
    }

    /**
     *
     * @return
     * The operationDescription
     */
    public String getOperationDescription() {
        return operationDescription;
    }

    /**
     *
     * @param operationDescription
     * The operation_description
     */
    public void setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
    }

    /**
     *
     * @return
     * The operationCode
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     *
     * @param operationCode
     * The operation_code
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

}