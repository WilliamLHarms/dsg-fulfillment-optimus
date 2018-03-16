
package com.dcsg.fulfillment.optimus.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NoteType",
    "NoteCode",
    "Note"
})
public class Comment {

    @JsonProperty("NoteType")
    private String noteType;
    @JsonProperty("NoteCode")
    private String noteCode;
    @JsonProperty("Note")
    private String note;

    @JsonProperty("NoteType")
    public String getNoteType() {
        return noteType;
    }

    @JsonProperty("NoteType")
    public void setNoteType(String noteType) {
        this.noteType = noteType;
    }

    @JsonProperty("NoteCode")
    public String getNoteCode() {
        return noteCode;
    }

    @JsonProperty("NoteCode")
    public void setNoteCode(String noteCode) {
        this.noteCode = noteCode;
    }

    @JsonProperty("Note")
    public String getNote() {
        return note;
    }

    @JsonProperty("Note")
    public void setNote(String note) {
        this.note = note;
    }

}
