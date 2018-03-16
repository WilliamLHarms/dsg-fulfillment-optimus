
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
    "BillToAddressLine3",
    "BillToCity",
    "BillToState",
    "BillToCounty",
    "BillToPostalCode",
    "BillToCountry",
    "BillToPhone",
    "BillToEmail",
    "BillToFax"
})
public class BillingDetails {

    @JsonProperty("BillToFirstName")
    private String billToFirstName;
    @JsonProperty("BillToLastName")
    private String billToLastName;
    @JsonProperty("BillToAddressLine1")
    private String billToAddressLine1;
    @JsonProperty("BillToAddressLine2")
    private String billToAddressLine2;
    @JsonProperty("BillToAddressLine3")
    private String billToAddressLine3;
    @JsonProperty("BillToCity")
    private String billToCity;
    @JsonProperty("BillToState")
    private String billToState;
    @JsonProperty("BillToCounty")
    private String billToCounty;
    @JsonProperty("BillToPostalCode")
    private String billToPostalCode;
    @JsonProperty("BillToCountry")
    private String billToCountry;
    @JsonProperty("BillToPhone")
    private String billToPhone;
    @JsonProperty("BillToEmail")
    private String billToEmail;
    @JsonProperty("BillToFax")
    private String billToFax;

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

    @JsonProperty("BillToAddressLine3")
    public String getBillToAddressLine3() {
        return billToAddressLine3;
    }

    @JsonProperty("BillToAddressLine3")
    public void setBillToAddressLine3(String billToAddressLine3) {
        this.billToAddressLine3 = billToAddressLine3;
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

    @JsonProperty("BillToCounty")
    public String getBillToCounty() {
        return billToCounty;
    }

    @JsonProperty("BillToCounty")
    public void setBillToCounty(String billToCounty) {
        this.billToCounty = billToCounty;
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

    @JsonProperty("BillToFax")
    public String getBillToFax() {
        return billToFax;
    }

    @JsonProperty("BillToFax")
    public void setBillToFax(String billToFax) {
        this.billToFax = billToFax;
    }

}
