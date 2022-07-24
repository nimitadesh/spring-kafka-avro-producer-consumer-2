package com.vishaluplanch.avro.planningevent.controller;

import com.vishaluplanch.avro.planningevent.model.PlanningEventModel;
import com.vishaluplanch.avro.planningevent.producer.PlanningEventsProducer;
import com.vishaluplanch.avro.schema.PlanningEvent;
import com.vishaluplanch.avro.schema.PlanningEventPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanningEventsRestController {

    @Autowired
    private PlanningEventsProducer planningEventsProducer;

    @PostMapping(value = "/sendPlanningEvent")
    public void sendPlanningEvent(@RequestBody PlanningEventModel planningEventModel) {

        /** SETTING UP THE PLANNING EVENT PAYLOAD (TO BE USED IN THE PLANNING EVENT ITSELF) */

        PlanningEventPayload.Builder planningEventPayloadBuilder = PlanningEventPayload.newBuilder();
        PlanningEventPayload planningEventPayload = planningEventPayloadBuilder.build();

        planningEventPayload.setBrand(planningEventPayload.getBrand());
        System.out.println("planningEventPayload's brand: " + planningEventPayload.getBrand());

        planningEventPayload.setMarket(planningEventPayload.getMarket());
        System.out.println("planningEventPayload's market: " + planningEventPayload.getMarket());

        planningEventPayload.setChannel(planningEventPayload.getChannel());
        System.out.println("planningEventPayload's channel: " + planningEventPayload.getChannel());

        planningEventPayload.setBrandGuid(planningEventPayload.getBrandGuid());
        System.out.println("planningEventPayload's brandGuid: " + planningEventPayload.getBrandGuid());

        planningEventPayload.setPlannedCustomerChoiceId(planningEventPayload.getPlannedCustomerChoiceId());
        System.out.println("planningEventPayload's plannedCustomerChoiceId: " + planningEventPayload.getPlannedCustomerChoiceId());


        /** SETTING UP THE PLANNING EVENT */

        PlanningEvent.Builder planningEventBuilder = PlanningEvent.newBuilder();    // creates a new planning event builder
        planningEventBuilder.setPayloadBuilder(planningEventPayloadBuilder);
        PlanningEvent planningEvent = planningEventBuilder.build();

        planningEvent.setEventId(planningEventModel.getEventId());
        planningEvent.setEventType(planningEventModel.getEventType());
        planningEvent.setPublishedDate(planningEventModel.getPublishedDate());
        planningEvent.setPayload(planningEventPayload);
        // planningEventBuilder.setPayloadBuilder(planningEventPayloadBuilder);  // ensures that payloadBuilder is not null

        planningEventsProducer.send(planningEvent);


//        PlanningEvent planningEvent = PlanningEvent.newBuilder().build();
//        PlanningEventPayload planningEventPayload = PlanningEventPayload.newBuilder().build();

        // PlanningEventPayload planningEventPayload = planningEvent.getPayload();
        // PlanningEventPayload planningEventPayload = PlanningEventPayload.newBuilder().build();






//        planningEventPayload.setBrand(planningEventModel.getPayload().getBrand());
//        planningEventPayload.setMarket(planningEventModel.getPayload().getMarket());
//        planningEventPayload.setChannel(planningEventModel.getPayload().getChannel());
//        planningEventPayload.setBrandGuid(planningEventModel.getPayload().getBrandGuid());
//        planningEventPayload.setPlannedCustomerChoiceId(planningEventModel.getPayload().getPlannedCustomerChoiceId());


    }
}
