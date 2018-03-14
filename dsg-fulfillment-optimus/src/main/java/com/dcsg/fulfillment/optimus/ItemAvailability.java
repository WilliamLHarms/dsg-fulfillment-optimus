package com.dcsg.fulfillment.optimus;

public class ItemAvailability {

	private Integer storeGroupQuantity;
	private Integer supplierGroupQuantity;
	private Integer dcGroupQuantity;

	public Integer getStoreGroupQuantity() {
		return storeGroupQuantity;
	}	
	public void setStoreGroupQuantity(Integer storeGroupQuantity) {
		this.storeGroupQuantity = storeGroupQuantity;
	}
	
	public Integer getSupplierGroupQuantity() {
		return supplierGroupQuantity;
	}
	public void setSupplierGroupQuantity(Integer supplierGroupQuantity) {
		this.supplierGroupQuantity = supplierGroupQuantity;
	}
	
	public Integer getDcGroupQuantity() {
		return dcGroupQuantity;
	}	
	public void setDcGroupQuantity(Integer dcGroupQuantity) {
		this.dcGroupQuantity = dcGroupQuantity;
	}
}
