
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ComponentGroup",
    "ComponentOption",
    "UpCharge"
})
public class ComponentDatum {

    @JsonProperty("ComponentGroup")
    private String componentGroup;
    @JsonProperty("ComponentOption")
    private String componentOption;
    @JsonProperty("UpCharge")
    private String upCharge;

    @JsonProperty("ComponentGroup")
    public String getComponentGroup() {
        return componentGroup;
    }

    @JsonProperty("ComponentGroup")
    public void setComponentGroup(String componentGroup) {
        this.componentGroup = componentGroup;
    }

    @JsonProperty("ComponentOption")
    public String getComponentOption() {
        return componentOption;
    }

    @JsonProperty("ComponentOption")
    public void setComponentOption(String componentOption) {
        this.componentOption = componentOption;
    }

    @JsonProperty("UpCharge")
    public String getUpCharge() {
        return upCharge;
    }

    @JsonProperty("UpCharge")
    public void setUpCharge(String upCharge) {
        this.upCharge = upCharge;
    }

}
