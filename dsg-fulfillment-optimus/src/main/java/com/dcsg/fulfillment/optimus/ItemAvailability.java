package com.dcsg.fulfillment.optimus;

public class ItemAvailability {

	private int storeGroupQuantity;
	private int supplierGroupQuantity;
	private int dcGroupQuantity;
	private String itemDepartment;
	private String itemSubDepartment;
	private String itemClass;
	private String itemSubClass;
	
	

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
	
	/** Getters and Setters for DEPT-SUBD-CLASS-SUBC - used for ship alones**/
	public void setItemDepartment(String itemDepartment ) {
		this.itemDepartment = itemDepartment;
		
	}
	
	public String  getItemDepartment() {
		return itemDepartment;
	}
	
	
	public void setItemSubDepartment (String itemSubDepartment) {
		this.itemSubDepartment = itemSubDepartment;
	}
	
	public String getItemSubDepartment() {
		return itemDepartment;
	}
	
	public void setItemClass(String itemClass) {
		this.itemClass = itemClass;
	}
	
	public String getItemClass () {
		return itemClass;
	}
	
	public void setItemSubClass (String itemSubClass) {
		this.itemSubClass = itemSubClass;
	}
	
	public String getItemSubClass () {
		return  itemSubClass;
	}
	
}
