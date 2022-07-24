package com.vishaluplanch.avro.planningevent.model;

public class PlanningEventModel {
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public PlanningEventPayloadModel getPayload() {
        return payload;
    }

    public void setPayload(PlanningEventPayloadModel payload) {
        this.payload = payload;
    }

    private String eventId;
    private String eventType;
    private String publishedDate;
    private PlanningEventPayloadModel payload;


}
