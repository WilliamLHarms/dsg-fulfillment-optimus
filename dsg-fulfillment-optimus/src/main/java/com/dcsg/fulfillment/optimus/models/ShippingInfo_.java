
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DeliveryTZ",
    "PickupTZ",
    "ShipToFacility"
})
public class ShippingInfo_ {

    @JsonProperty("DeliveryTZ")
    private String deliveryTZ;
    @JsonProperty("PickupTZ")
    private String pickupTZ;
    @JsonProperty("ShipToFacility")
    private String shipToFacility;

    @JsonProperty("DeliveryTZ")
    public String getDeliveryTZ() {
        return deliveryTZ;
    }

    @JsonProperty("DeliveryTZ")
    public void setDeliveryTZ(String deliveryTZ) {
        this.deliveryTZ = deliveryTZ;
    }

    @JsonProperty("PickupTZ")
    public String getPickupTZ() {
        return pickupTZ;
    }

    @JsonProperty("PickupTZ")
    public void setPickupTZ(String pickupTZ) {
        this.pickupTZ = pickupTZ;
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
