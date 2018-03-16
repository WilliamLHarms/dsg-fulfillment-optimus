
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Comment"
})
public class Comments {

    @JsonProperty("Comment")
    private Comment comment;

    @JsonProperty("Comment")
    public Comment getComment() {
        return comment;
    }

    @JsonProperty("Comment")
    public void setComment(Comment comment) {
        this.comment = comment;
    }

}
