
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OrderedQty",
    "OrderedQtyUOM"
})
public class Quantity {

    @JsonProperty("OrderedQty")
    private String orderedQty;
    @JsonProperty("OrderedQtyUOM")
    private String orderedQtyUOM;

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

}
