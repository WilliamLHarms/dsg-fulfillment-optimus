
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BillToFirstName",
    "BillToLastName",
    "BillToAddressLine1",
    "BillToAddressLine2",
    "BillToCity",
    "BillToState",
    "BillToPostalCode",
    "BillToCountry",
    "BillToPhone",
    "BillToEmail"
})
public class BillToDetail {

    @JsonProperty("BillToFirstName")
    private String billToFirstName;
    @JsonProperty("BillToLastName")
    private String billToLastName;
    @JsonProperty("BillToAddressLine1")
    private String billToAddressLine1;
    @JsonProperty("BillToAddressLine2")
    private String billToAddressLine2;
    @JsonProperty("BillToCity")
    private String billToCity;
    @JsonProperty("BillToState")
    private String billToState;
    @JsonProperty("BillToPostalCode")
    private String billToPostalCode;
    @JsonProperty("BillToCountry")
    private String billToCountry;
    @JsonProperty("BillToPhone")
    private String billToPhone;
    @JsonProperty("BillToEmail")
    private String billToEmail;

    @JsonProperty("BillToFirstName")
    public String getBillToFirstName() {
        return billToFirstName;
    }

    @JsonProperty("BillToFirstName")
    public void setBillToFirstName(String billToFirstName) {
        this.billToFirstName = billToFirstName;
    }

    @JsonProperty("BillToLastName")
    public String getBillToLastName() {
        return billToLastName;
    }

    @JsonProperty("BillToLastName")
    public void setBillToLastName(String billToLastName) {
        this.billToLastName = billToLastName;
    }

    @JsonProperty("BillToAddressLine1")
    public String getBillToAddressLine1() {
        return billToAddressLine1;
    }

    @JsonProperty("BillToAddressLine1")
    public void setBillToAddressLine1(String billToAddressLine1) {
        this.billToAddressLine1 = billToAddressLine1;
    }

    @JsonProperty("BillToAddressLine2")
    public String getBillToAddressLine2() {
        return billToAddressLine2;
    }

    @JsonProperty("BillToAddressLine2")
    public void setBillToAddressLine2(String billToAddressLine2) {
        this.billToAddressLine2 = billToAddressLine2;
    }

    @JsonProperty("BillToCity")
    public String getBillToCity() {
        return billToCity;
    }

    @JsonProperty("BillToCity")
    public void setBillToCity(String billToCity) {
        this.billToCity = billToCity;
    }

    @JsonProperty("BillToState")
    public String getBillToState() {
        return billToState;
    }

    @JsonProperty("BillToState")
    public void setBillToState(String billToState) {
        this.billToState = billToState;
    }

    @JsonProperty("BillToPostalCode")
    public String getBillToPostalCode() {
        return billToPostalCode;
    }

    @JsonProperty("BillToPostalCode")
    public void setBillToPostalCode(String billToPostalCode) {
        this.billToPostalCode = billToPostalCode;
    }

    @JsonProperty("BillToCountry")
    public String getBillToCountry() {
        return billToCountry;
    }

    @JsonProperty("BillToCountry")
    public void setBillToCountry(String billToCountry) {
        this.billToCountry = billToCountry;
    }

    @JsonProperty("BillToPhone")
    public String getBillToPhone() {
        return billToPhone;
    }

    @JsonProperty("BillToPhone")
    public void setBillToPhone(String billToPhone) {
        this.billToPhone = billToPhone;
    }

    @JsonProperty("BillToEmail")
    public String getBillToEmail() {
        return billToEmail;
    }

    @JsonProperty("BillToEmail")
    public void setBillToEmail(String billToEmail) {
        this.billToEmail = billToEmail;
    }

}
