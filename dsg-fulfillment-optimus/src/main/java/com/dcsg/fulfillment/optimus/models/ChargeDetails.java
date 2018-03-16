
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ChargeDetail"
})
public class ChargeDetails {

    @JsonProperty("ChargeDetail")
    private ChargeDetail chargeDetail;

    @JsonProperty("ChargeDetail")
    public ChargeDetail getChargeDetail() {
        return chargeDetail;
    }

    @JsonProperty("ChargeDetail")
    public void setChargeDetail(ChargeDetail chargeDetail) {
        this.chargeDetail = chargeDetail;
    }

}
