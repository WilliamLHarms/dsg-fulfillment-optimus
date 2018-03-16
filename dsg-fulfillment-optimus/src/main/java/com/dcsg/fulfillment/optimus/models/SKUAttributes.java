
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "InventoryType",
    "ProductStatus",
    "BatchNumber",
    "SKUAttribute1",
    "SKUAttribute2",
    "SKUAttribute3",
    "SKUAttribute4",
    "SKUAttribute5",
    "CountryOfOrigin"
})
public class SKUAttributes {

    @JsonProperty("InventoryType")
    private String inventoryType;
    @JsonProperty("ProductStatus")
    private String productStatus;
    @JsonProperty("BatchNumber")
    private String batchNumber;
    @JsonProperty("SKUAttribute1")
    private String sKUAttribute1;
    @JsonProperty("SKUAttribute2")
    private String sKUAttribute2;
    @JsonProperty("SKUAttribute3")
    private String sKUAttribute3;
    @JsonProperty("SKUAttribute4")
    private String sKUAttribute4;
    @JsonProperty("SKUAttribute5")
    private String sKUAttribute5;
    @JsonProperty("CountryOfOrigin")
    private String countryOfOrigin;

    @JsonProperty("InventoryType")
    public String getInventoryType() {
        return inventoryType;
    }

    @JsonProperty("InventoryType")
    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    @JsonProperty("ProductStatus")
    public String getProductStatus() {
        return productStatus;
    }

    @JsonProperty("ProductStatus")
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    @JsonProperty("BatchNumber")
    public String getBatchNumber() {
        return batchNumber;
    }

    @JsonProperty("BatchNumber")
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    @JsonProperty("SKUAttribute1")
    public String getSKUAttribute1() {
        return sKUAttribute1;
    }

    @JsonProperty("SKUAttribute1")
    public void setSKUAttribute1(String sKUAttribute1) {
        this.sKUAttribute1 = sKUAttribute1;
    }

    @JsonProperty("SKUAttribute2")
    public String getSKUAttribute2() {
        return sKUAttribute2;
    }

    @JsonProperty("SKUAttribute2")
    public void setSKUAttribute2(String sKUAttribute2) {
        this.sKUAttribute2 = sKUAttribute2;
    }

    @JsonProperty("SKUAttribute3")
    public String getSKUAttribute3() {
        return sKUAttribute3;
    }

    @JsonProperty("SKUAttribute3")
    public void setSKUAttribute3(String sKUAttribute3) {
        this.sKUAttribute3 = sKUAttribute3;
    }

    @JsonProperty("SKUAttribute4")
    public String getSKUAttribute4() {
        return sKUAttribute4;
    }

    @JsonProperty("SKUAttribute4")
    public void setSKUAttribute4(String sKUAttribute4) {
        this.sKUAttribute4 = sKUAttribute4;
    }

    @JsonProperty("SKUAttribute5")
    public String getSKUAttribute5() {
        return sKUAttribute5;
    }

    @JsonProperty("SKUAttribute5")
    public void setSKUAttribute5(String sKUAttribute5) {
        this.sKUAttribute5 = sKUAttribute5;
    }

    @JsonProperty("CountryOfOrigin")
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @JsonProperty("CountryOfOrigin")
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

}
