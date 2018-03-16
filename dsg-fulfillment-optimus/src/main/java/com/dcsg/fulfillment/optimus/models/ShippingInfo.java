
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ShipVia",
    "ShippingAddress",
    "MustDeliverBy",
    "PromisedDeliveryBy",
    "RequestedDeliveryBy",
    "DesignatedCarrierCode",
    "DesignatedModeCode",
    "DesignatedServiceLevelCode",
    "DeliveryTZ",
    "PickupTZ",
    "ShipToFacility"
})
public class ShippingInfo {

    @JsonProperty("ShipVia")
    private String shipVia;
    @JsonProperty("ShippingAddress")
    private ShippingAddress shippingAddress;
    @JsonProperty("MustDeliverBy")
    private String mustDeliverBy;
    @JsonProperty("PromisedDeliveryBy")
    private String promisedDeliveryBy;
    @JsonProperty("RequestedDeliveryBy")
    private String requestedDeliveryBy;
    @JsonProperty("DesignatedCarrierCode")
    private String designatedCarrierCode;
    @JsonProperty("DesignatedModeCode")
    private String designatedModeCode;
    @JsonProperty("DesignatedServiceLevelCode")
    private String designatedServiceLevelCode;
    @JsonProperty("DeliveryTZ")
    private String deliveryTZ;
    @JsonProperty("PickupTZ")
    private String pickupTZ;
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

    @JsonProperty("ShippingAddress")
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    @JsonProperty("ShippingAddress")
    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @JsonProperty("MustDeliverBy")
    public String getMustDeliverBy() {
        return mustDeliverBy;
    }

    @JsonProperty("MustDeliverBy")
    public void setMustDeliverBy(String mustDeliverBy) {
        this.mustDeliverBy = mustDeliverBy;
    }

    @JsonProperty("PromisedDeliveryBy")
    public String getPromisedDeliveryBy() {
        return promisedDeliveryBy;
    }

    @JsonProperty("PromisedDeliveryBy")
    public void setPromisedDeliveryBy(String promisedDeliveryBy) {
        this.promisedDeliveryBy = promisedDeliveryBy;
    }

    @JsonProperty("RequestedDeliveryBy")
    public String getRequestedDeliveryBy() {
        return requestedDeliveryBy;
    }

    @JsonProperty("RequestedDeliveryBy")
    public void setRequestedDeliveryBy(String requestedDeliveryBy) {
        this.requestedDeliveryBy = requestedDeliveryBy;
    }

    @JsonProperty("DesignatedCarrierCode")
    public String getDesignatedCarrierCode() {
        return designatedCarrierCode;
    }

    @JsonProperty("DesignatedCarrierCode")
    public void setDesignatedCarrierCode(String designatedCarrierCode) {
        this.designatedCarrierCode = designatedCarrierCode;
    }

    @JsonProperty("DesignatedModeCode")
    public String getDesignatedModeCode() {
        return designatedModeCode;
    }

    @JsonProperty("DesignatedModeCode")
    public void setDesignatedModeCode(String designatedModeCode) {
        this.designatedModeCode = designatedModeCode;
    }

    @JsonProperty("DesignatedServiceLevelCode")
    public String getDesignatedServiceLevelCode() {
        return designatedServiceLevelCode;
    }

    @JsonProperty("DesignatedServiceLevelCode")
    public void setDesignatedServiceLevelCode(String designatedServiceLevelCode) {
        this.designatedServiceLevelCode = designatedServiceLevelCode;
    }

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
