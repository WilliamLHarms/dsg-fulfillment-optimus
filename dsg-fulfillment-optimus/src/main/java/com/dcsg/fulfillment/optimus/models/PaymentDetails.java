
package com.dcsg.fulfillment.optimus.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PaymentDetail"
})
public class PaymentDetails {

    @JsonProperty("PaymentDetail")
    private List<PaymentDetail> paymentDetail = null;

    @JsonProperty("PaymentDetail")
    public List<PaymentDetail> getPaymentDetail() {
        return paymentDetail;
    }

    @JsonProperty("PaymentDetail")
    public void setPaymentDetail(List<PaymentDetail> paymentDetail) {
        this.paymentDetail = paymentDetail;
    }

}
