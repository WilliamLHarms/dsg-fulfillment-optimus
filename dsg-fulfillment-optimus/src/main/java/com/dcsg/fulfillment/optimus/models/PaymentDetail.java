
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ExternalPaymentDetailId",
    "PaymentMethod",
    "CardType",
    "AccountDisplayNumber",
    "ReqAuthorizationAmount",
    "ChargeSequence",
    "BillToDetail"
})
public class PaymentDetail {

    @JsonProperty("ExternalPaymentDetailId")
    private String externalPaymentDetailId;
    @JsonProperty("PaymentMethod")
    private String paymentMethod;
    @JsonProperty("CardType")
    private String cardType;
    @JsonProperty("AccountDisplayNumber")
    private String accountDisplayNumber;
    @JsonProperty("ReqAuthorizationAmount")
    private String reqAuthorizationAmount;
    @JsonProperty("ChargeSequence")
    private String chargeSequence;
    @JsonProperty("BillToDetail")
    private BillToDetail billToDetail;

    @JsonProperty("ExternalPaymentDetailId")
    public String getExternalPaymentDetailId() {
        return externalPaymentDetailId;
    }

    @JsonProperty("ExternalPaymentDetailId")
    public void setExternalPaymentDetailId(String externalPaymentDetailId) {
        this.externalPaymentDetailId = externalPaymentDetailId;
    }

    @JsonProperty("PaymentMethod")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("PaymentMethod")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @JsonProperty("CardType")
    public String getCardType() {
        return cardType;
    }

    @JsonProperty("CardType")
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @JsonProperty("AccountDisplayNumber")
    public String getAccountDisplayNumber() {
        return accountDisplayNumber;
    }

    @JsonProperty("AccountDisplayNumber")
    public void setAccountDisplayNumber(String accountDisplayNumber) {
        this.accountDisplayNumber = accountDisplayNumber;
    }

    @JsonProperty("ReqAuthorizationAmount")
    public String getReqAuthorizationAmount() {
        return reqAuthorizationAmount;
    }

    @JsonProperty("ReqAuthorizationAmount")
    public void setReqAuthorizationAmount(String reqAuthorizationAmount) {
        this.reqAuthorizationAmount = reqAuthorizationAmount;
    }

    @JsonProperty("ChargeSequence")
    public String getChargeSequence() {
        return chargeSequence;
    }

    @JsonProperty("ChargeSequence")
    public void setChargeSequence(String chargeSequence) {
        this.chargeSequence = chargeSequence;
    }

    @JsonProperty("BillToDetail")
    public BillToDetail getBillToDetail() {
        return billToDetail;
    }

    @JsonProperty("BillToDetail")
    public void setBillToDetail(BillToDetail billToDetail) {
        this.billToDetail = billToDetail;
    }

}
