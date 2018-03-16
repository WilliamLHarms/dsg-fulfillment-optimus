
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LineNumber",
    "OrderLineStatus",
    "LineType",
    "ItemID",
    "ComponentDataList",
    "PriceInfo",
    "Quantity",
    "ShippingInfo",
    "LineReferenceFields",
    "SKUAttributes",
    "AllocationDetails",
    "ExternalItemID",
    "MerchGroup",
    "MerchType",
    "IsGift",
    "LineTotal",
    "OnHold",
    "SendCustomerEmail",
    "DOSplitCategory",
    "EffectiveRank",
    "IsCancelled",
    "IsDeleted",
    "ExpiryDttm",
    "ReasonCode",
    "AllocationInfo",
    "DiscountDetails",
    "TaxDetails",
    "LineWMProcessInfo",
    "Comments"
})
public class OrderLine {

    @JsonProperty("LineNumber")
    private String lineNumber;
    @JsonProperty("OrderLineStatus")
    private String orderLineStatus;
    @JsonProperty("LineType")
    private String lineType;
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
    @JsonProperty("LineReferenceFields")
    private LineReferenceFields lineReferenceFields;
    @JsonProperty("SKUAttributes")
    private SKUAttributes sKUAttributes;
    @JsonProperty("AllocationDetails")
    private AllocationDetails allocationDetails;
    @JsonProperty("ExternalItemID")
    private String externalItemID;
    @JsonProperty("MerchGroup")
    private String merchGroup;
    @JsonProperty("MerchType")
    private String merchType;
    @JsonProperty("IsGift")
    private String isGift;
    @JsonProperty("LineTotal")
    private String lineTotal;
    @JsonProperty("OnHold")
    private String onHold;
    @JsonProperty("SendCustomerEmail")
    private String sendCustomerEmail;
    @JsonProperty("DOSplitCategory")
    private String dOSplitCategory;
    @JsonProperty("EffectiveRank")
    private String effectiveRank;
    @JsonProperty("IsCancelled")
    private String isCancelled;
    @JsonProperty("IsDeleted")
    private String isDeleted;
    @JsonProperty("ExpiryDttm")
    private String expiryDttm;
    @JsonProperty("ReasonCode")
    private String reasonCode;
    @JsonProperty("AllocationInfo")
    private AllocationInfo allocationInfo;
    @JsonProperty("DiscountDetails")
    private String discountDetails;
    @JsonProperty("TaxDetails")
    private String taxDetails;
    @JsonProperty("LineWMProcessInfo")
    private String lineWMProcessInfo;
    @JsonProperty("Comments")
    private Comments comments;

    @JsonProperty("LineNumber")
    public String getLineNumber() {
        return lineNumber;
    }

    @JsonProperty("LineNumber")
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    @JsonProperty("OrderLineStatus")
    public String getOrderLineStatus() {
        return orderLineStatus;
    }

    @JsonProperty("OrderLineStatus")
    public void setOrderLineStatus(String orderLineStatus) {
        this.orderLineStatus = orderLineStatus;
    }

    @JsonProperty("LineType")
    public String getLineType() {
        return lineType;
    }

    @JsonProperty("LineType")
    public void setLineType(String lineType) {
        this.lineType = lineType;
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

    @JsonProperty("LineReferenceFields")
    public LineReferenceFields getLineReferenceFields() {
    	if (lineReferenceFields == null) {
    		this.lineReferenceFields = new LineReferenceFields();
    	}
        return lineReferenceFields;
    }

    @JsonProperty("LineReferenceFields")
    public void setLineReferenceFields(LineReferenceFields lineReferenceFields) {
        this.lineReferenceFields = lineReferenceFields;
    }

    @JsonProperty("SKUAttributes")
    public SKUAttributes getSKUAttributes() {
        return sKUAttributes;
    }

    @JsonProperty("SKUAttributes")
    public void setSKUAttributes(SKUAttributes sKUAttributes) {
        this.sKUAttributes = sKUAttributes;
    }

    @JsonProperty("AllocationDetails")
    public AllocationDetails getAllocationDetails() {
        return allocationDetails;
    }

    @JsonProperty("AllocationDetails")
    public void setAllocationDetails(AllocationDetails allocationDetails) {
        this.allocationDetails = allocationDetails;
    }

    @JsonProperty("ExternalItemID")
    public String getExternalItemID() {
        return externalItemID;
    }

    @JsonProperty("ExternalItemID")
    public void setExternalItemID(String externalItemID) {
        this.externalItemID = externalItemID;
    }

    @JsonProperty("MerchGroup")
    public String getMerchGroup() {
        return merchGroup;
    }

    @JsonProperty("MerchGroup")
    public void setMerchGroup(String merchGroup) {
        this.merchGroup = merchGroup;
    }

    @JsonProperty("MerchType")
    public String getMerchType() {
        return merchType;
    }

    @JsonProperty("MerchType")
    public void setMerchType(String merchType) {
        this.merchType = merchType;
    }

    @JsonProperty("IsGift")
    public String getIsGift() {
        return isGift;
    }

    @JsonProperty("IsGift")
    public void setIsGift(String isGift) {
        this.isGift = isGift;
    }

    @JsonProperty("LineTotal")
    public String getLineTotal() {
        return lineTotal;
    }

    @JsonProperty("LineTotal")
    public void setLineTotal(String lineTotal) {
        this.lineTotal = lineTotal;
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

    @JsonProperty("DOSplitCategory")
    public String getDOSplitCategory() {
        return dOSplitCategory;
    }

    @JsonProperty("DOSplitCategory")
    public void setDOSplitCategory(String dOSplitCategory) {
        this.dOSplitCategory = dOSplitCategory;
    }

    @JsonProperty("EffectiveRank")
    public String getEffectiveRank() {
        return effectiveRank;
    }

    @JsonProperty("EffectiveRank")
    public void setEffectiveRank(String effectiveRank) {
        this.effectiveRank = effectiveRank;
    }

    @JsonProperty("IsCancelled")
    public String getIsCancelled() {
        return isCancelled;
    }

    @JsonProperty("IsCancelled")
    public void setIsCancelled(String isCancelled) {
        this.isCancelled = isCancelled;
    }

    @JsonProperty("IsDeleted")
    public String getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("IsDeleted")
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("ExpiryDttm")
    public String getExpiryDttm() {
        return expiryDttm;
    }

    @JsonProperty("ExpiryDttm")
    public void setExpiryDttm(String expiryDttm) {
        this.expiryDttm = expiryDttm;
    }

    @JsonProperty("ReasonCode")
    public String getReasonCode() {
        return reasonCode;
    }

    @JsonProperty("ReasonCode")
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    @JsonProperty("AllocationInfo")
    public AllocationInfo getAllocationInfo() {
        return allocationInfo;
    }

    @JsonProperty("AllocationInfo")
    public void setAllocationInfo(AllocationInfo allocationInfo) {
        this.allocationInfo = allocationInfo;
    }

    @JsonProperty("DiscountDetails")
    public String getDiscountDetails() {
        return discountDetails;
    }

    @JsonProperty("DiscountDetails")
    public void setDiscountDetails(String discountDetails) {
        this.discountDetails = discountDetails;
    }

    @JsonProperty("TaxDetails")
    public String getTaxDetails() {
        return taxDetails;
    }

    @JsonProperty("TaxDetails")
    public void setTaxDetails(String taxDetails) {
        this.taxDetails = taxDetails;
    }

    @JsonProperty("LineWMProcessInfo")
    public String getLineWMProcessInfo() {
        return lineWMProcessInfo;
    }

    @JsonProperty("LineWMProcessInfo")
    public void setLineWMProcessInfo(String lineWMProcessInfo) {
        this.lineWMProcessInfo = lineWMProcessInfo;
    }

    @JsonProperty("Comments")
    public Comments getComments() {
        return comments;
    }

    @JsonProperty("Comments")
    public void setComments(Comments comments) {
        this.comments = comments;
    }

}
