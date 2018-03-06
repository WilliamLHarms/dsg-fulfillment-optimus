
package com.dcsg.fulfillment.optimus.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OrderLine"
})
public class OrderLines {

    @JsonProperty("OrderLine")
    private List<OrderLine> orderLine = null;

    @JsonProperty("OrderLine")
    public List<OrderLine> getOrderLine() {
        return orderLine;
    }

    @JsonProperty("OrderLine")
    public void setOrderLine(List<OrderLine> orderLine) {
        this.orderLine = orderLine;
    }

}
