
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OrderNumber",
    "OrderCaptureDate",
    "OrderSubtotal",
    "OrderTotal",
    "OrderCurrency",
    "Confirmed",
    "Canceled",
    "OrderType",
    "LastUpdatedDTTM",
    "CustomerInfo",
    "PaymentDetails",
    "ReferenceFields",
    "CustomFieldList",
    "OrderLines"
})
public class Order {

    @JsonProperty("OrderNumber")
    private String orderNumber;
    @JsonProperty("OrderCaptureDate")
    private String orderCaptureDate;
    @JsonProperty("OrderSubtotal")
    private String orderSubtotal;
    @JsonProperty("OrderTotal")
    private String orderTotal;
    @JsonProperty("OrderCurrency")
    private String orderCurrency;
    @JsonProperty("Confirmed")
    private String confirmed;
    @JsonProperty("Canceled")
    private String canceled;
    @JsonProperty("OrderType")
    private String orderType;
    @JsonProperty("LastUpdatedDTTM")
    private String lastUpdatedDTTM;
    @JsonProperty("CustomerInfo")
    private CustomerInfo customerInfo;
    @JsonProperty("PaymentDetails")
    private PaymentDetails paymentDetails;
    @JsonProperty("ReferenceFields")
    private ReferenceFields referenceFields;
    @JsonProperty("CustomFieldList")
    private CustomFieldList customFieldList;
    @JsonProperty("OrderLines")
    private OrderLines orderLines;

    @JsonProperty("OrderNumber")
    public String getOrderNumber() {
        return orderNumber;
    }

    @JsonProperty("OrderNumber")
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @JsonProperty("OrderCaptureDate")
    public String getOrderCaptureDate() {
        return orderCaptureDate;
    }

    @JsonProperty("OrderCaptureDate")
    public void setOrderCaptureDate(String orderCaptureDate) {
        this.orderCaptureDate = orderCaptureDate;
    }

    @JsonProperty("OrderSubtotal")
    public String getOrderSubtotal() {
        return orderSubtotal;
    }

    @JsonProperty("OrderSubtotal")
    public void setOrderSubtotal(String orderSubtotal) {
        this.orderSubtotal = orderSubtotal;
    }

    @JsonProperty("OrderTotal")
    public String getOrderTotal() {
        return orderTotal;
    }

    @JsonProperty("OrderTotal")
    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    @JsonProperty("OrderCurrency")
    public String getOrderCurrency() {
        return orderCurrency;
    }

    @JsonProperty("OrderCurrency")
    public void setOrderCurrency(String orderCurrency) {
        this.orderCurrency = orderCurrency;
    }

    @JsonProperty("Confirmed")
    public String getConfirmed() {
        return confirmed;
    }

    @JsonProperty("Confirmed")
    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    @JsonProperty("Canceled")
    public String getCanceled() {
        return canceled;
    }

    @JsonProperty("Canceled")
    public void setCanceled(String canceled) {
        this.canceled = canceled;
    }

    @JsonProperty("OrderType")
    public String getOrderType() {
        return orderType;
    }

    @JsonProperty("OrderType")
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @JsonProperty("LastUpdatedDTTM")
    public String getLastUpdatedDTTM() {
        return lastUpdatedDTTM;
    }

    @JsonProperty("LastUpdatedDTTM")
    public void setLastUpdatedDTTM(String lastUpdatedDTTM) {
        this.lastUpdatedDTTM = lastUpdatedDTTM;
    }

    @JsonProperty("CustomerInfo")
    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    @JsonProperty("CustomerInfo")
    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    @JsonProperty("PaymentDetails")
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    @JsonProperty("PaymentDetails")
    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @JsonProperty("ReferenceFields")
    public ReferenceFields getReferenceFields() {
        return referenceFields;
    }

    @JsonProperty("ReferenceFields")
    public void setReferenceFields(ReferenceFields referenceFields) {
        this.referenceFields = referenceFields;
    }

    @JsonProperty("CustomFieldList")
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    @JsonProperty("CustomFieldList")
    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @JsonProperty("OrderLines")
    public OrderLines getOrderLines() {
        return orderLines;
    }

    @JsonProperty("OrderLines")
    public void setOrderLines(OrderLines orderLines) {
        this.orderLines = orderLines;
    }

}
