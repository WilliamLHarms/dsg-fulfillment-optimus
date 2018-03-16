
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@version",
    "@encoding",
    "tXML"
})
public class OrderXML {

    @JsonProperty("@version")
    private String version;
    @JsonProperty("@encoding")
    private String encoding;
    @JsonProperty("tXML")
    private TXML tXML;

    @JsonProperty("@version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("@version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("@encoding")
    public String getEncoding() {
        return encoding;
    }

    @JsonProperty("@encoding")
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    @JsonProperty("tXML")
    public TXML getTXML() {
        return tXML;
    }

    @JsonProperty("tXML")
    public void setTXML(TXML tXML) {
        this.tXML = tXML;
    }

}
