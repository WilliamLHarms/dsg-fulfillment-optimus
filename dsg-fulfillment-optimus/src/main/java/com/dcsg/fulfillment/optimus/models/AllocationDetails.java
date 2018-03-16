
package com.dcsg.fulfillment.optimus.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllocationDetail"
})
public class AllocationDetails {

    @JsonProperty("AllocationDetail")
    private List<AllocationDetail> allocationDetail = null;

    @JsonProperty("AllocationDetail")
    public List<AllocationDetail> getAllocationDetail() {
        return allocationDetail;
    }

    @JsonProperty("AllocationDetail")
    public void setAllocationDetail(List<AllocationDetail> allocationDetail) {
        this.allocationDetail = allocationDetail;
    }

}
