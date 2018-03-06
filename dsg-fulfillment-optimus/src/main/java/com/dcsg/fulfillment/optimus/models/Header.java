
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Source",
    "Action_Type",
    "Message_Type",
    "Company_ID",
    "Msg_Time_Zone"
})
public class Header {

    @JsonProperty("Source")
    private String source;
    @JsonProperty("Action_Type")
    private String actionType;
    @JsonProperty("Message_Type")
    private String messageType;
    @JsonProperty("Company_ID")
    private String companyID;
    @JsonProperty("Msg_Time_Zone")
    private String msgTimeZone;

    @JsonProperty("Source")
    public String getSource() {
        return source;
    }

    @JsonProperty("Source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("Action_Type")
    public String getActionType() {
        return actionType;
    }

    @JsonProperty("Action_Type")
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    @JsonProperty("Message_Type")
    public String getMessageType() {
        return messageType;
    }

    @JsonProperty("Message_Type")
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    @JsonProperty("Company_ID")
    public String getCompanyID() {
        return companyID;
    }

    @JsonProperty("Company_ID")
    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    @JsonProperty("Msg_Time_Zone")
    public String getMsgTimeZone() {
        return msgTimeZone;
    }

    @JsonProperty("Msg_Time_Zone")
    public void setMsgTimeZone(String msgTimeZone) {
        this.msgTimeZone = msgTimeZone;
    }

}
