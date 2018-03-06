
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Header",
    "Message"
})
public class TXML {

    @JsonProperty("Header")
    private Header header;
    @JsonProperty("Message")
    private Message message;

    @JsonProperty("Header")
    public Header getHeader() {
        return header;
    }

    @JsonProperty("Header")
    public void setHeader(Header header) {
        this.header = header;
    }

    @JsonProperty("Message")
    public Message getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(Message message) {
        this.message = message;
    }

}
