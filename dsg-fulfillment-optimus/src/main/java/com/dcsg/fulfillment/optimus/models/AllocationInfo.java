
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FulfillmentFacility"
})
public class AllocationInfo {

    @JsonProperty("FulfillmentFacility")
    private String fulfillmentFacility;

    @JsonProperty("FulfillmentFacility")
    public String getFulfillmentFacility() {
        return fulfillmentFacility;
    }

    @JsonProperty("FulfillmentFacility")
    public void setFulfillmentFacility(String fulfillmentFacility) {
        this.fulfillmentFacility = fulfillmentFacility;
    }

}
