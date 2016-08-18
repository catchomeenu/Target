package com.target.oprations.retail.response.productResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by msutar on 8/15/16.
 */
public class BusinessProcessStatus {


    @SerializedName("process_status")
    @Expose
    private ProcessStatus processStatus;

    /**
     * @return The processStatus
     */
    public ProcessStatus getProcessStatus() {
        return processStatus;
    }

    /**
     * @param processStatus The process_status
     */
    public void setProcessStatus(ProcessStatus processStatus) {
        this.processStatus = processStatus;
    }
}
