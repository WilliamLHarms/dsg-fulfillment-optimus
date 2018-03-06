
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"ReferenceField5", //Optimus
    "LineNumber",
    "ItemID",
    "ComponentDataList",
    "PriceInfo",
    "Quantity",
    "ShippingInfo",
    "LineTotal",
    "Canceled",
    "AllocationInfo"
})
public class OrderLine {

	//Optimus
	@JsonProperty("ReferenceField5")
	private String referenceField5;
	
    @JsonProperty("LineNumber")
    private String lineNumber;
    @JsonProperty("ItemID")
    private String itemID;
    @JsonProperty("ComponentDataList")
    private ComponentDataList componentDataList;
    @JsonProperty("PriceInfo")
    private PriceInfo priceInfo;
    @JsonProperty("Quantity")
    private Quantity quantity;
    @JsonProperty("ShippingInfo")
    private ShippingInfo shippingInfo;
    @JsonProperty("LineTotal")
    private String lineTotal;
    @JsonProperty("Canceled")
    private String canceled;
    @JsonProperty("AllocationInfo")
    private AllocationInfo allocationInfo;
    
    //Optimus
    @JsonProperty("ReferenceField5")
    public String getReferenceField5() {
        return referenceField5;
    }

    //Optimus
    @JsonProperty("ReferenceField5")
    public void setReferenceField5(String referenceField5) {
        this.referenceField5 = referenceField5;
    }

    @JsonProperty("LineNumber")
    public String getLineNumber() {
        return lineNumber;
    }

    @JsonProperty("LineNumber")
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    @JsonProperty("ItemID")
    public String getItemID() {
        return itemID;
    }

    @JsonProperty("ItemID")
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    @JsonProperty("ComponentDataList")
    public ComponentDataList getComponentDataList() {
        return componentDataList;
    }

    @JsonProperty("ComponentDataList")
    public void setComponentDataList(ComponentDataList componentDataList) {
        this.componentDataList = componentDataList;
    }

    @JsonProperty("PriceInfo")
    public PriceInfo getPriceInfo() {
        return priceInfo;
    }

    @JsonProperty("PriceInfo")
    public void setPriceInfo(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
    }

    @JsonProperty("Quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("ShippingInfo")
    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    @JsonProperty("ShippingInfo")
    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    @JsonProperty("LineTotal")
    public String getLineTotal() {
        return lineTotal;
    }

    @JsonProperty("LineTotal")
    public void setLineTotal(String lineTotal) {
        this.lineTotal = lineTotal;
    }

    @JsonProperty("Canceled")
    public String getCanceled() {
        return canceled;
    }

    @JsonProperty("Canceled")
    public void setCanceled(String canceled) {
        this.canceled = canceled;
    }

    @JsonProperty("AllocationInfo")
    public AllocationInfo getAllocationInfo() {
        return allocationInfo;
    }

    @JsonProperty("AllocationInfo")
    public void setAllocationInfo(AllocationInfo allocationInfo) {
        this.allocationInfo = allocationInfo;
    }

}
