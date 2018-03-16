
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OrderedQty",
    "OrderedQtyUOM",
    "OriginalOrderQty",
    "AllocatedQuantity",
    "ReleasedQty",
    "CancelledQty"
})
public class Quantity {

    @JsonProperty("OrderedQty")
    private String orderedQty;
    @JsonProperty("OrderedQtyUOM")
    private String orderedQtyUOM;
    @JsonProperty("OriginalOrderQty")
    private String originalOrderQty;
    @JsonProperty("AllocatedQuantity")
    private String allocatedQuantity;
    @JsonProperty("ReleasedQty")
    private String releasedQty;
    @JsonProperty("CancelledQty")
    private String cancelledQty;

    @JsonProperty("OrderedQty")
    public String getOrderedQty() {
        return orderedQty;
    }

    @JsonProperty("OrderedQty")
    public void setOrderedQty(String orderedQty) {
        this.orderedQty = orderedQty;
    }

    @JsonProperty("OrderedQtyUOM")
    public String getOrderedQtyUOM() {
        return orderedQtyUOM;
    }

    @JsonProperty("OrderedQtyUOM")
    public void setOrderedQtyUOM(String orderedQtyUOM) {
        this.orderedQtyUOM = orderedQtyUOM;
    }

    @JsonProperty("OriginalOrderQty")
    public String getOriginalOrderQty() {
        return originalOrderQty;
    }

    @JsonProperty("OriginalOrderQty")
    public void setOriginalOrderQty(String originalOrderQty) {
        this.originalOrderQty = originalOrderQty;
    }

    @JsonProperty("AllocatedQuantity")
    public String getAllocatedQuantity() {
        return allocatedQuantity;
    }

    @JsonProperty("AllocatedQuantity")
    public void setAllocatedQuantity(String allocatedQuantity) {
        this.allocatedQuantity = allocatedQuantity;
    }

    @JsonProperty("ReleasedQty")
    public String getReleasedQty() {
        return releasedQty;
    }

    @JsonProperty("ReleasedQty")
    public void setReleasedQty(String releasedQty) {
        this.releasedQty = releasedQty;
    }

    @JsonProperty("CancelledQty")
    public String getCancelledQty() {
        return cancelledQty;
    }

    @JsonProperty("CancelledQty")
    public void setCancelledQty(String cancelledQty) {
        this.cancelledQty = cancelledQty;
    }

}
