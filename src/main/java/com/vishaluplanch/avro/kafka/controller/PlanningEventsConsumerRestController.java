package com.vishaluplanch.avro.kafka.controller;

import com.vishaluplanch.avro.kafka.model.PlanningEventModel;
import com.vishaluplanch.avro.kafka.model.StockHistoryModel;
import com.vishaluplanch.avro.kafka.producer.PlanningEventsProducer;
import com.vishaluplanch.avro.kafka.producer.SpringAvroProducer;
import com.vishaluplanch.avro.schema.PlanningEvent;
import com.vishaluplanch.avro.schema.StockHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class PlanningEventsConsumerRestController {

    @Autowired
    private PlanningEventsProducer planningEventsProducer;

    @PostMapping(value = "/sendPlanningEvent")
    public void sendStockHistory(@RequestBody PlanningEventModel planningEventModel) {

        PlanningEvent planningEvent = PlanningEvent.newBuilder().build();

        planningEvent.setBrand(planningEventModel.getBrand());
        planningEvent.setMarket(planningEventModel.getMarket());
        planningEvent.setChannel(planningEventModel.getChannel());
        planningEvent.setBrandGuid(planningEventModel.getBrandGuid());
        planningEvent.setPlannedCustomerChoiceId(planningEventModel.getPlannedCustomerChoiceId());

        planningEventsProducer.send(planningEvent);
    }
}
