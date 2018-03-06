
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ShipVia",
    "DeliveryOption",
    "ShippingAddress",
    "ShipToFacility"
})
public class ShippingInfo {

    @JsonProperty("ShipVia")
    private String shipVia;
    @JsonProperty("DeliveryOption")
    private String deliveryOption;
    @JsonProperty("ShippingAddress")
    private ShippingAddress shippingAddress;
    @JsonProperty("ShipToFacility")
    private String shipToFacility;

    @JsonProperty("ShipVia")
    public String getShipVia() {
        return shipVia;
    }

    @JsonProperty("ShipVia")
    public void setShipVia(String shipVia) {
        this.shipVia = shipVia;
    }

    @JsonProperty("DeliveryOption")
    public String getDeliveryOption() {
        return deliveryOption;
    }

    @JsonProperty("DeliveryOption")
    public void setDeliveryOption(String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }

    @JsonProperty("ShippingAddress")
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    @JsonProperty("ShippingAddress")
    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @JsonProperty("ShipToFacility")
    public String getShipToFacility() {
        return shipToFacility;
    }

    @JsonProperty("ShipToFacility")
    public void setShipToFacility(String shipToFacility) {
        this.shipToFacility = shipToFacility;
    }

}
