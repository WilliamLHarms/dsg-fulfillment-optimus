
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ExtChargeDetailId",
    "ChargeName",
    "ChargeAmount",
    "UnitCharge",
    "MarkForDeletion",
    "ChargeCategory"
})
public class ChargeDetail {

    @JsonProperty("ExtChargeDetailId")
    private String extChargeDetailId;
    @JsonProperty("ChargeName")
    private String chargeName;
    @JsonProperty("ChargeAmount")
    private String chargeAmount;
    @JsonProperty("UnitCharge")
    private String unitCharge;
    @JsonProperty("MarkForDeletion")
    private String markForDeletion;
    @JsonProperty("ChargeCategory")
    private String chargeCategory;

    @JsonProperty("ExtChargeDetailId")
    public String getExtChargeDetailId() {
        return extChargeDetailId;
    }

    @JsonProperty("ExtChargeDetailId")
    public void setExtChargeDetailId(String extChargeDetailId) {
        this.extChargeDetailId = extChargeDetailId;
    }

    @JsonProperty("ChargeName")
    public String getChargeName() {
        return chargeName;
    }

    @JsonProperty("ChargeName")
    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }

    @JsonProperty("ChargeAmount")
    public String getChargeAmount() {
        return chargeAmount;
    }

    @JsonProperty("ChargeAmount")
    public void setChargeAmount(String chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    @JsonProperty("UnitCharge")
    public String getUnitCharge() {
        return unitCharge;
    }

    @JsonProperty("UnitCharge")
    public void setUnitCharge(String unitCharge) {
        this.unitCharge = unitCharge;
    }

    @JsonProperty("MarkForDeletion")
    public String getMarkForDeletion() {
        return markForDeletion;
    }

    @JsonProperty("MarkForDeletion")
    public void setMarkForDeletion(String markForDeletion) {
        this.markForDeletion = markForDeletion;
    }

    @JsonProperty("ChargeCategory")
    public String getChargeCategory() {
        return chargeCategory;
    }

    @JsonProperty("ChargeCategory")
    public void setChargeCategory(String chargeCategory) {
        this.chargeCategory = chargeCategory;
    }

}
