package com.dcsg.fulfillment.optimus;

public class ItemAvailability {

	private int storeGroupQuantity;
	private int supplierGroupQuantity;
	private int dcGroupQuantity;

	public int getStoreGroupQuantity() {
		return storeGroupQuantity;
	}	
	public void setStoreGroupQuantity(int storeGroupQuantity) {
		this.storeGroupQuantity = storeGroupQuantity;
	}
	
	public int getSupplierGroupQuantity() {
		return supplierGroupQuantity;
	}
	public void setSupplierGroupQuantity(int supplierGroupQuantity) {
		this.supplierGroupQuantity = supplierGroupQuantity;
	}
	
	public int getDcGroupQuantity() {
		return dcGroupQuantity;
	}	
	public void setDcGroupQuantity(int dcGroupQuantity) {
		this.dcGroupQuantity = dcGroupQuantity;
	}
}
