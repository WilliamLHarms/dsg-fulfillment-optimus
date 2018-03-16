
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Price",
    "RefundPrice",
    "ExtendedPrice",
    "PurchasePrice",
    "CurrencyCode"
})
public class PriceInfo {

    @JsonProperty("Price")
    private String price;
    @JsonProperty("RefundPrice")
    private String refundPrice;
    @JsonProperty("ExtendedPrice")
    private String extendedPrice;
    @JsonProperty("PurchasePrice")
    private String purchasePrice;
    @JsonProperty("CurrencyCode")
    private String currencyCode;

    @JsonProperty("Price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("Price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("RefundPrice")
    public String getRefundPrice() {
        return refundPrice;
    }

    @JsonProperty("RefundPrice")
    public void setRefundPrice(String refundPrice) {
        this.refundPrice = refundPrice;
    }

    @JsonProperty("ExtendedPrice")
    public String getExtendedPrice() {
        return extendedPrice;
    }

    @JsonProperty("ExtendedPrice")
    public void setExtendedPrice(String extendedPrice) {
        this.extendedPrice = extendedPrice;
    }

    @JsonProperty("PurchasePrice")
    public String getPurchasePrice() {
        return purchasePrice;
    }

    @JsonProperty("PurchasePrice")
    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @JsonProperty("CurrencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("CurrencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

}
