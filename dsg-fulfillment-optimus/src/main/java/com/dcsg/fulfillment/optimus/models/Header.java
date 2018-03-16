
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
    "Msg_Time_Zone",
    "Sequence_Number",
    "Batch_ID",
    "Reference_ID",
    "Msg_Locale",
    "Version"
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
    @JsonProperty("Sequence_Number")
    private String sequenceNumber;
    @JsonProperty("Batch_ID")
    private String batchID;
    @JsonProperty("Reference_ID")
    private String referenceID;
    @JsonProperty("Msg_Locale")
    private String msgLocale;
    @JsonProperty("Version")
    private String version;

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

    @JsonProperty("Sequence_Number")
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    @JsonProperty("Sequence_Number")
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    @JsonProperty("Batch_ID")
    public String getBatchID() {
        return batchID;
    }

    @JsonProperty("Batch_ID")
    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    @JsonProperty("Reference_ID")
    public String getReferenceID() {
        return referenceID;
    }

    @JsonProperty("Reference_ID")
    public void setReferenceID(String referenceID) {
        this.referenceID = referenceID;
    }

    @JsonProperty("Msg_Locale")
    public String getMsgLocale() {
        return msgLocale;
    }

    @JsonProperty("Msg_Locale")
    public void setMsgLocale(String msgLocale) {
        this.msgLocale = msgLocale;
    }

    @JsonProperty("Version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("Version")
    public void setVersion(String version) {
        this.version = version;
    }

}
