
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CustomerId",
    "CustomerFirstName",
    "CustomerLastName",
    "CustomerPhone",
    "CustomerEmail",
    "CustomerUserId",
    "CustomerType"
})
public class CustomerInfo {

    @JsonProperty("CustomerId")
    private String customerId;
    @JsonProperty("CustomerFirstName")
    private String customerFirstName;
    @JsonProperty("CustomerLastName")
    private String customerLastName;
    @JsonProperty("CustomerPhone")
    private String customerPhone;
    @JsonProperty("CustomerEmail")
    private String customerEmail;
    @JsonProperty("CustomerUserId")
    private String customerUserId;
    @JsonProperty("CustomerType")
    private String customerType;

    @JsonProperty("CustomerId")
    public String getCustomerId() {
        return customerId;
    }

    @JsonProperty("CustomerId")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("CustomerFirstName")
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    @JsonProperty("CustomerFirstName")
    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    @JsonProperty("CustomerLastName")
    public String getCustomerLastName() {
        return customerLastName;
    }

    @JsonProperty("CustomerLastName")
    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    @JsonProperty("CustomerPhone")
    public String getCustomerPhone() {
        return customerPhone;
    }

    @JsonProperty("CustomerPhone")
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @JsonProperty("CustomerEmail")
    public String getCustomerEmail() {
        return customerEmail;
    }

    @JsonProperty("CustomerEmail")
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @JsonProperty("CustomerUserId")
    public String getCustomerUserId() {
        return customerUserId;
    }

    @JsonProperty("CustomerUserId")
    public void setCustomerUserId(String customerUserId) {
        this.customerUserId = customerUserId;
    }

    @JsonProperty("CustomerType")
    public String getCustomerType() {
        return customerType;
    }

    @JsonProperty("CustomerType")
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

}
