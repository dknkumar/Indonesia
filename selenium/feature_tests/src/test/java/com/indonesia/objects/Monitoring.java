package com.indonesia.objects;


public class Monitoring {
    private String batchId;
    private String gtin;
    private String messageType;
    private String messageId;

    public Monitoring() {
    }

    public Monitoring withBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public Monitoring withGtin(String gtin) {
        this.gtin = gtin;
        return this;
    }

    public Monitoring withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public Monitoring withMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    public String getBatchId() {
        return batchId;
    }

    public String getGtin() {
        return gtin;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getMessageType() {
        return messageType;
    }
}
