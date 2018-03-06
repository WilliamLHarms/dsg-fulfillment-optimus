
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ComponentGroup"
})
public class ComponentDatum {

    @JsonProperty("ComponentGroup")
    private String componentGroup;

    @JsonProperty("ComponentGroup")
    public String getComponentGroup() {
        return componentGroup;
    }

    @JsonProperty("ComponentGroup")
    public void setComponentGroup(String componentGroup) {
        this.componentGroup = componentGroup;
    }

}
