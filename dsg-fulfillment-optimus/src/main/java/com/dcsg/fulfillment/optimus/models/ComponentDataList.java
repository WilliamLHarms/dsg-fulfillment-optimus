
package com.dcsg.fulfillment.optimus.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ComponentData"
})
public class ComponentDataList {

    @JsonProperty("ComponentData")
    private List<ComponentDatum> componentData = null;

    @JsonProperty("ComponentData")
    public List<ComponentDatum> getComponentData() {
        return componentData;
    }

    @JsonProperty("ComponentData")
    public void setComponentData(List<ComponentDatum> componentData) {
        this.componentData = componentData;
    }

}
