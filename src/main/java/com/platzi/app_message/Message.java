package com.platzi.app_message;

public class Message {
    private int messageId;
    private String message;
    private String authorMessage;
    private String createdAtMessage;

    //Constructor
    public Message() {

    }

    public Message(String message, String authorMessage, String createdAtMessage) {
        this.message = message;
        this.authorMessage = authorMessage;
        this.createdAtMessage = createdAtMessage;
    }

    //Getters and Setters
    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthorMessage() {
        return authorMessage;
    }

    public void setAuthorMessage(String authorMessage) {
        this.authorMessage = authorMessage;
    }

    public String getCreatedAtMessage() {
        return createdAtMessage;
    }

    public void setCreatedAtMessage(String createdAtMessage) {
        this.createdAtMessage = createdAtMessage;
    }
}
