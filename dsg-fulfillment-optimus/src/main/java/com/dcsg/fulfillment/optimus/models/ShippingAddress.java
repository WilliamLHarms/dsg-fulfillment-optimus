
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ShipToFirstName",
    "ShipToLastName",
    "ShipToAddressLine1",
    "ShipToAddressLine2",
    "ShipToCity",
    "ShipToState",
    "ShipToPostalCode",
    "ShipToCountry",
    "ShipToPhone",
    "ShipToCounty",
    "ShipToEmail",
    "ShipToFax",
    "ShippingAddressVerified"
})
public class ShippingAddress {

    @JsonProperty("ShipToFirstName")
    private String shipToFirstName;
    @JsonProperty("ShipToLastName")
    private String shipToLastName;
    @JsonProperty("ShipToAddressLine1")
    private String shipToAddressLine1;
    @JsonProperty("ShipToAddressLine2")
    private String shipToAddressLine2;
    @JsonProperty("ShipToCity")
    private String shipToCity;
    @JsonProperty("ShipToState")
    private String shipToState;
    @JsonProperty("ShipToPostalCode")
    private String shipToPostalCode;
    @JsonProperty("ShipToCountry")
    private String shipToCountry;
    @JsonProperty("ShipToPhone")
    private String shipToPhone;
    @JsonProperty("ShipToCounty")
    private String shipToCounty;
    @JsonProperty("ShipToEmail")
    private String shipToEmail;
    @JsonProperty("ShipToFax")
    private String shipToFax;
    @JsonProperty("ShippingAddressVerified")
    private String shippingAddressVerified;

    @JsonProperty("ShipToFirstName")
    public String getShipToFirstName() {
        return shipToFirstName;
    }

    @JsonProperty("ShipToFirstName")
    public void setShipToFirstName(String shipToFirstName) {
        this.shipToFirstName = shipToFirstName;
    }

    @JsonProperty("ShipToLastName")
    public String getShipToLastName() {
        return shipToLastName;
    }

    @JsonProperty("ShipToLastName")
    public void setShipToLastName(String shipToLastName) {
        this.shipToLastName = shipToLastName;
    }

    @JsonProperty("ShipToAddressLine1")
    public String getShipToAddressLine1() {
        return shipToAddressLine1;
    }

    @JsonProperty("ShipToAddressLine1")
    public void setShipToAddressLine1(String shipToAddressLine1) {
        this.shipToAddressLine1 = shipToAddressLine1;
    }

    @JsonProperty("ShipToAddressLine2")
    public String getShipToAddressLine2() {
        return shipToAddressLine2;
    }

    @JsonProperty("ShipToAddressLine2")
    public void setShipToAddressLine2(String shipToAddressLine2) {
        this.shipToAddressLine2 = shipToAddressLine2;
    }

    @JsonProperty("ShipToCity")
    public String getShipToCity() {
        return shipToCity;
    }

    @JsonProperty("ShipToCity")
    public void setShipToCity(String shipToCity) {
        this.shipToCity = shipToCity;
    }

    @JsonProperty("ShipToState")
    public String getShipToState() {
        return shipToState;
    }

    @JsonProperty("ShipToState")
    public void setShipToState(String shipToState) {
        this.shipToState = shipToState;
    }

    @JsonProperty("ShipToPostalCode")
    public String getShipToPostalCode() {
        return shipToPostalCode;
    }

    @JsonProperty("ShipToPostalCode")
    public void setShipToPostalCode(String shipToPostalCode) {
        this.shipToPostalCode = shipToPostalCode;
    }

    @JsonProperty("ShipToCountry")
    public String getShipToCountry() {
        return shipToCountry;
    }

    @JsonProperty("ShipToCountry")
    public void setShipToCountry(String shipToCountry) {
        this.shipToCountry = shipToCountry;
    }

    @JsonProperty("ShipToPhone")
    public String getShipToPhone() {
        return shipToPhone;
    }

    @JsonProperty("ShipToPhone")
    public void setShipToPhone(String shipToPhone) {
        this.shipToPhone = shipToPhone;
    }

    @JsonProperty("ShipToCounty")
    public String getShipToCounty() {
        return shipToCounty;
    }

    @JsonProperty("ShipToCounty")
    public void setShipToCounty(String shipToCounty) {
        this.shipToCounty = shipToCounty;
    }

    @JsonProperty("ShipToEmail")
    public String getShipToEmail() {
        return shipToEmail;
    }

    @JsonProperty("ShipToEmail")
    public void setShipToEmail(String shipToEmail) {
        this.shipToEmail = shipToEmail;
    }

    @JsonProperty("ShipToFax")
    public String getShipToFax() {
        return shipToFax;
    }

    @JsonProperty("ShipToFax")
    public void setShipToFax(String shipToFax) {
        this.shipToFax = shipToFax;
    }

    @JsonProperty("ShippingAddressVerified")
    public String getShippingAddressVerified() {
        return shippingAddressVerified;
    }

    @JsonProperty("ShippingAddressVerified")
    public void setShippingAddressVerified(String shippingAddressVerified) {
        this.shippingAddressVerified = shippingAddressVerified;
    }

}
