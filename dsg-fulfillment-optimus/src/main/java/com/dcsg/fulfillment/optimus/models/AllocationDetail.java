
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SupplyType",
    "OriginFacilityAliasID",
    "FacilityType",
    "CommittedShipDTTM",
    "CommittedDeliveryDTTM",
    "CreatedDTTM",
    "ModifiedDTTM",
    "AllocationStatus",
    "ItemID",
    "AllocatedQuantity",
    "SupplyID",
    "SupplyDetailID",
    "IsVirtualAllocation",
    "SubstitutionRatio",
    "TierId",
    "MustReleaseByDTTM",
    "MustShipByDTTM",
    "AllocatedQtyUOM",
    "SubstitutionType",
    "InventorySegmentID"
})
public class AllocationDetail {

    @JsonProperty("SupplyType")
    private String supplyType;
    @JsonProperty("OriginFacilityAliasID")
    private String originFacilityAliasID;
    @JsonProperty("FacilityType")
    private String facilityType;
    @JsonProperty("CommittedShipDTTM")
    private String committedShipDTTM;
    @JsonProperty("CommittedDeliveryDTTM")
    private String committedDeliveryDTTM;
    @JsonProperty("CreatedDTTM")
    private String createdDTTM;
    @JsonProperty("ModifiedDTTM")
    private String modifiedDTTM;
    @JsonProperty("AllocationStatus")
    private String allocationStatus;
    @JsonProperty("ItemID")
    private String itemID;
    @JsonProperty("AllocatedQuantity")
    private String allocatedQuantity;
    @JsonProperty("SupplyID")
    private String supplyID;
    @JsonProperty("SupplyDetailID")
    private String supplyDetailID;
    @JsonProperty("IsVirtualAllocation")
    private String isVirtualAllocation;
    @JsonProperty("SubstitutionRatio")
    private String substitutionRatio;
    @JsonProperty("TierId")
    private String tierId;
    @JsonProperty("MustReleaseByDTTM")
    private String mustReleaseByDTTM;
    @JsonProperty("MustShipByDTTM")
    private String mustShipByDTTM;
    @JsonProperty("AllocatedQtyUOM")
    private String allocatedQtyUOM;
    @JsonProperty("SubstitutionType")
    private String substitutionType;
    @JsonProperty("InventorySegmentID")
    private String inventorySegmentID;

    @JsonProperty("SupplyType")
    public String getSupplyType() {
        return supplyType;
    }

    @JsonProperty("SupplyType")
    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    @JsonProperty("OriginFacilityAliasID")
    public String getOriginFacilityAliasID() {
        return originFacilityAliasID;
    }

    @JsonProperty("OriginFacilityAliasID")
    public void setOriginFacilityAliasID(String originFacilityAliasID) {
        this.originFacilityAliasID = originFacilityAliasID;
    }

    @JsonProperty("FacilityType")
    public String getFacilityType() {
        return facilityType;
    }

    @JsonProperty("FacilityType")
    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    @JsonProperty("CommittedShipDTTM")
    public String getCommittedShipDTTM() {
        return committedShipDTTM;
    }

    @JsonProperty("CommittedShipDTTM")
    public void setCommittedShipDTTM(String committedShipDTTM) {
        this.committedShipDTTM = committedShipDTTM;
    }

    @JsonProperty("CommittedDeliveryDTTM")
    public String getCommittedDeliveryDTTM() {
        return committedDeliveryDTTM;
    }

    @JsonProperty("CommittedDeliveryDTTM")
    public void setCommittedDeliveryDTTM(String committedDeliveryDTTM) {
        this.committedDeliveryDTTM = committedDeliveryDTTM;
    }

    @JsonProperty("CreatedDTTM")
    public String getCreatedDTTM() {
        return createdDTTM;
    }

    @JsonProperty("CreatedDTTM")
    public void setCreatedDTTM(String createdDTTM) {
        this.createdDTTM = createdDTTM;
    }

    @JsonProperty("ModifiedDTTM")
    public String getModifiedDTTM() {
        return modifiedDTTM;
    }

    @JsonProperty("ModifiedDTTM")
    public void setModifiedDTTM(String modifiedDTTM) {
        this.modifiedDTTM = modifiedDTTM;
    }

    @JsonProperty("AllocationStatus")
    public String getAllocationStatus() {
        return allocationStatus;
    }

    @JsonProperty("AllocationStatus")
    public void setAllocationStatus(String allocationStatus) {
        this.allocationStatus = allocationStatus;
    }

    @JsonProperty("ItemID")
    public String getItemID() {
        return itemID;
    }

    @JsonProperty("ItemID")
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    @JsonProperty("AllocatedQuantity")
    public String getAllocatedQuantity() {
        return allocatedQuantity;
    }

    @JsonProperty("AllocatedQuantity")
    public void setAllocatedQuantity(String allocatedQuantity) {
        this.allocatedQuantity = allocatedQuantity;
    }

    @JsonProperty("SupplyID")
    public String getSupplyID() {
        return supplyID;
    }

    @JsonProperty("SupplyID")
    public void setSupplyID(String supplyID) {
        this.supplyID = supplyID;
    }

    @JsonProperty("SupplyDetailID")
    public String getSupplyDetailID() {
        return supplyDetailID;
    }

    @JsonProperty("SupplyDetailID")
    public void setSupplyDetailID(String supplyDetailID) {
        this.supplyDetailID = supplyDetailID;
    }

    @JsonProperty("IsVirtualAllocation")
    public String getIsVirtualAllocation() {
        return isVirtualAllocation;
    }

    @JsonProperty("IsVirtualAllocation")
    public void setIsVirtualAllocation(String isVirtualAllocation) {
        this.isVirtualAllocation = isVirtualAllocation;
    }

    @JsonProperty("SubstitutionRatio")
    public String getSubstitutionRatio() {
        return substitutionRatio;
    }

    @JsonProperty("SubstitutionRatio")
    public void setSubstitutionRatio(String substitutionRatio) {
        this.substitutionRatio = substitutionRatio;
    }

    @JsonProperty("TierId")
    public String getTierId() {
        return tierId;
    }

    @JsonProperty("TierId")
    public void setTierId(String tierId) {
        this.tierId = tierId;
    }

    @JsonProperty("MustReleaseByDTTM")
    public String getMustReleaseByDTTM() {
        return mustReleaseByDTTM;
    }

    @JsonProperty("MustReleaseByDTTM")
    public void setMustReleaseByDTTM(String mustReleaseByDTTM) {
        this.mustReleaseByDTTM = mustReleaseByDTTM;
    }

    @JsonProperty("MustShipByDTTM")
    public String getMustShipByDTTM() {
        return mustShipByDTTM;
    }

    @JsonProperty("MustShipByDTTM")
    public void setMustShipByDTTM(String mustShipByDTTM) {
        this.mustShipByDTTM = mustShipByDTTM;
    }

    @JsonProperty("AllocatedQtyUOM")
    public String getAllocatedQtyUOM() {
        return allocatedQtyUOM;
    }

    @JsonProperty("AllocatedQtyUOM")
    public void setAllocatedQtyUOM(String allocatedQtyUOM) {
        this.allocatedQtyUOM = allocatedQtyUOM;
    }

    @JsonProperty("SubstitutionType")
    public String getSubstitutionType() {
        return substitutionType;
    }

    @JsonProperty("SubstitutionType")
    public void setSubstitutionType(String substitutionType) {
        this.substitutionType = substitutionType;
    }

    @JsonProperty("InventorySegmentID")
    public String getInventorySegmentID() {
        return inventorySegmentID;
    }

    @JsonProperty("InventorySegmentID")
    public void setInventorySegmentID(String inventorySegmentID) {
        this.inventorySegmentID = inventorySegmentID;
    }

}
