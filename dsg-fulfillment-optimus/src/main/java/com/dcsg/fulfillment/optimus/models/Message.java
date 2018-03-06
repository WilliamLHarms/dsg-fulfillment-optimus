
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Order"
})
public class Message {

    @JsonProperty("Order")
    private Order order;

    @JsonProperty("Order")
    public Order getOrder() {
        return order;
    }

    @JsonProperty("Order")
    public void setOrder(Order order) {
        this.order = order;
    }

}
