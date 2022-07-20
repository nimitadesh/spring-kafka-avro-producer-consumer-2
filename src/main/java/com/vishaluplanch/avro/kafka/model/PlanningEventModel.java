package com.vishaluplanch.avro.kafka.model;

public class PlanningEventModel {
    private String brand;
    private String market;
    private String channel;
    private String brandGuid;
    private String plannedCustomerChoiceId;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getBrandGuid() {
        return brandGuid;
    }

    public void setBrandGuid(String brandGuid) {
        this.brandGuid = brandGuid;
    }

    public String getPlannedCustomerChoiceId() {
        return plannedCustomerChoiceId;
    }

    public void setPlannedCustomerChoiceId(String plannedCustomerChoiceId) {
        this.plannedCustomerChoiceId = plannedCustomerChoiceId;
    }
}
