
package com.dcsg.fulfillment.optimus.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CustomField"
})
public class CustomFieldList {

    @JsonProperty("CustomField")
    private List<CustomField> customField = null;

    @JsonProperty("CustomField")
    public List<CustomField> getCustomField() {
        return customField;
    }

    @JsonProperty("CustomField")
    public void setCustomField(List<CustomField> customField) {
        this.customField = customField;
    }

}
