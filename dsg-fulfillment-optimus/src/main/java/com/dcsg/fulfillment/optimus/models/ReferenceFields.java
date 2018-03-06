
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ReferenceField4"
})
public class ReferenceFields {

    @JsonProperty("ReferenceField4")
    private String referenceField4;

    @JsonProperty("ReferenceField4")
    public String getReferenceField4() {
        return referenceField4;
    }

    @JsonProperty("ReferenceField4")
    public void setReferenceField4(String referenceField4) {
        this.referenceField4 = referenceField4;
    }

}
