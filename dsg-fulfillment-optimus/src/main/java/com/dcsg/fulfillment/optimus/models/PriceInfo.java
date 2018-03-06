
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Price"
})
public class PriceInfo {

    @JsonProperty("Price")
    private String price;

    @JsonProperty("Price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("Price")
    public void setPrice(String price) {
        this.price = price;
    }

}
