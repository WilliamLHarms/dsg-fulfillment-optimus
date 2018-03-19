
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
    "OrderStatus",
    "CustomerInfo",
    "PaymentDetails",
    "Notes",
    "ReferenceFields",
    "CustomFieldList",
    "OrderLines",
    "ExternalOrderNumber",
    "EnteredBy",
    "EnteredLocation",
    "EntryType",
    "OnHold",
    "SendCustomerEmail",
    "AlternatePickup",
    "ReasonCode",
    "PaymentStatus",
    "ShippingInfo",
    "BillingDetails",
    "ChargeDetails",
    "TaxDetails",
    "DiscountDetails",
    "WMProcessInfo",
    "WMWorkType"
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
    private String lastUpdatedDttm;
    @JsonProperty("OrderStatus")
    private String orderStatus;
    @JsonProperty("CustomerInfo")
    private CustomerInfo customerInfo;
    @JsonProperty("PaymentDetails")
    private PaymentDetails paymentDetails;
    @JsonProperty("Notes")
    private Notes notes;
    @JsonProperty("ReferenceFields")
    private ReferenceFields referenceFields;
    @JsonProperty("CustomFieldList")
    private CustomFieldList customFieldList;
    @JsonProperty("OrderLines")
    private OrderLines orderLines;
    @JsonProperty("ExternalOrderNumber")
    private String externalOrderNumber;
    @JsonProperty("EnteredBy")
    private String enteredBy;
    @JsonProperty("EnteredLocation")
    private String enteredLocation;
    @JsonProperty("EntryType")
    private String entryType;
    @JsonProperty("OnHold")
    private String onHold;
    @JsonProperty("SendCustomerEmail")
    private String sendCustomerEmail;
    @JsonProperty("AlternatePickup")
    private String alternatePickup;
    @JsonProperty("ReasonCode")
    private String reasonCode;
    @JsonProperty("PaymentStatus")
    private String paymentStatus;
    @JsonProperty("ShippingInfo")
    private ShippingInfo_ shippingInfo;
    @JsonProperty("BillingDetails")
    private BillingDetails billingDetails;
    @JsonProperty("ChargeDetails")
    private ChargeDetails chargeDetails;
    @JsonProperty("TaxDetails")
    private String taxDetails;
    @JsonProperty("DiscountDetails")
    private String discountDetails;
    @JsonProperty("WMProcessInfo")
    private String wMProcessInfo;
    @JsonProperty("WMWorkType")
    private String wMWorkType;

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
    public String lastUpdatedDttm() {
        return lastUpdatedDttm;
    }

    @JsonProperty("LastUpdatedDTTM")
    public void setLastUpdatedDttm(String lastUpdatedDttm) {
        this.lastUpdatedDttm = lastUpdatedDttm;
    }
    
    @JsonProperty("OrderStatus")
    public String getOrderStatus() {
        return orderStatus;
    }

    @JsonProperty("OrderStatus")
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
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

    @JsonProperty("Notes")
    public Notes getNotes() {
        return notes;
    }

    @JsonProperty("Notes")
    public void setNotes(Notes notes) {
        this.notes = notes;
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

    @JsonProperty("ExternalOrderNumber")
    public String getExternalOrderNumber() {
        return externalOrderNumber;
    }

    @JsonProperty("ExternalOrderNumber")
    public void setExternalOrderNumber(String externalOrderNumber) {
        this.externalOrderNumber = externalOrderNumber;
    }

    @JsonProperty("EnteredBy")
    public String getEnteredBy() {
        return enteredBy;
    }

    @JsonProperty("EnteredBy")
    public void setEnteredBy(String enteredBy) {
        this.enteredBy = enteredBy;
    }

    @JsonProperty("EnteredLocation")
    public String getEnteredLocation() {
        return enteredLocation;
    }

    @JsonProperty("EnteredLocation")
    public void setEnteredLocation(String enteredLocation) {
        this.enteredLocation = enteredLocation;
    }

    @JsonProperty("EntryType")
    public String getEntryType() {
        return entryType;
    }

    @JsonProperty("EntryType")
    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    @JsonProperty("OnHold")
    public String getOnHold() {
        return onHold;
    }

    @JsonProperty("OnHold")
    public void setOnHold(String onHold) {
        this.onHold = onHold;
    }

    @JsonProperty("SendCustomerEmail")
    public String getSendCustomerEmail() {
        return sendCustomerEmail;
    }

    @JsonProperty("SendCustomerEmail")
    public void setSendCustomerEmail(String sendCustomerEmail) {
        this.sendCustomerEmail = sendCustomerEmail;
    }

    @JsonProperty("AlternatePickup")
    public String getAlternatePickup() {
        return alternatePickup;
    }

    @JsonProperty("AlternatePickup")
    public void setAlternatePickup(String alternatePickup) {
        this.alternatePickup = alternatePickup;
    }

    @JsonProperty("ReasonCode")
    public String getReasonCode() {
        return reasonCode;
    }

    @JsonProperty("ReasonCode")
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    @JsonProperty("PaymentStatus")
    public String getPaymentStatus() {
        return paymentStatus;
    }

    @JsonProperty("PaymentStatus")
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @JsonProperty("ShippingInfo")
    public ShippingInfo_ getShippingInfo() {
        return shippingInfo;
    }

    @JsonProperty("ShippingInfo")
    public void setShippingInfo(ShippingInfo_ shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    @JsonProperty("BillingDetails")
    public BillingDetails getBillingDetails() {
        return billingDetails;
    }

    @JsonProperty("BillingDetails")
    public void setBillingDetails(BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
    }

    @JsonProperty("ChargeDetails")
    public ChargeDetails getChargeDetails() {
        return chargeDetails;
    }

    @JsonProperty("ChargeDetails")
    public void setChargeDetails(ChargeDetails chargeDetails) {
        this.chargeDetails = chargeDetails;
    }

    @JsonProperty("TaxDetails")
    public String getTaxDetails() {
        return taxDetails;
    }

    @JsonProperty("TaxDetails")
    public void setTaxDetails(String taxDetails) {
        this.taxDetails = taxDetails;
    }

    @JsonProperty("DiscountDetails")
    public String getDiscountDetails() {
        return discountDetails;
    }

    @JsonProperty("DiscountDetails")
    public void setDiscountDetails(String discountDetails) {
        this.discountDetails = discountDetails;
    }

    @JsonProperty("WMProcessInfo")
    public String getWMProcessInfo() {
        return wMProcessInfo;
    }

    @JsonProperty("WMProcessInfo")
    public void setWMProcessInfo(String wMProcessInfo) {
        this.wMProcessInfo = wMProcessInfo;
    }

    @JsonProperty("WMWorkType")
    public String getWMWorkType() {
        return wMWorkType;
    }

    @JsonProperty("WMWorkType")
    public void setWMWorkType(String wMWorkType) {
        this.wMWorkType = wMWorkType;
    }

}
