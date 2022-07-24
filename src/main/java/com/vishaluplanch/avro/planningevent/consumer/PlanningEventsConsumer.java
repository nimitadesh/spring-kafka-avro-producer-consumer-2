package com.vishaluplanch.avro.planningevent.consumer;

// import com.vishaluplanch.avro.adapterevent.producer.AdapterEventsProducer;
import com.vishaluplanch.avro.schema.PlanningEvent;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

// import static com.vishaluplanch.avro.adapterevent.producer.ProcessPlanningEvents.processPlanningEvent;

// import static com.vishaluplanch.avro.planningevent.controller.AdapterEventTopicRouter.processPlanningEvent;



@Service
public class PlanningEventsConsumer {

    // private AdapterEventsProducer adapterEventsProducer = new AdapterEventsProducer();


//    public void read(ConsumerRecord<String, StockHistory> record){
//        String key=record.key();
//        StockHistory history=record.value();
//        System.out.println("Avro message received for key : "+key+ " value : "+history.toString());
//    }

    /*********************************** WORKING PLAN CREATED TOPICS LISTENERS ****************************************/

    @KafkaListener(topics = "testPlanningTopic", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromTestPlanningTopic(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "testPlanningTopic2", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromTestPlanningTopic2(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
        System.out.println();
        // processPlanningEvent(planningEvent);
        // processPlanningEvent(planningEvent);
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceWasCreated.BR", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromWorkingPlanCreatedBR(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
//        topicName = "planning.customerChoice.PlannedCustomerChoiceWasCreated.BR";
//        kafkaTemplate.send("planning.customerChoice.PlannedCustomerChoiceWasCreated.BR", String.valueOf(adapterEvent.getEventId()), adapterEvent);
        // topicName = "projector.customerChoice.PlannedCustomerChoiceWorkingPlanWasProcessed.BR-aggregated";
//        AdapterEvent adapterEvent = new AdapterEvent("c4357df7-2ad5-4d71-a774-27e3830bf02d", "PlannedCustomerChoiceWorkingPlanWasProcessed", "2020-02-29T22:41:51.828Z");
//        kafkaTemplate.send("projector.customerChoice.PlannedCustomerChoiceWorkingPlanWasProcessed.BR-aggregated", (String) adapterEvent.getEventId(), adapterEvent);
    }

    @KafkaListener(topics = "projector.customerChoice.PlannedCustomerChoiceWorkingPlanWasProcessed.BR-aggregated", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromWorkingPlanProcessedBR(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
//        topicName = "planning.customerChoice.PlannedCustomerChoiceWasCreated.BR";
//        kafkaTemplate.send("planning.customerChoice.PlannedCustomerChoiceWasCreated.BR", String.valueOf(adapterEvent.getEventId()), adapterEvent);
        // topicName = "projector.customerChoice.PlannedCustomerChoiceWorkingPlanWasProcessed.BR-aggregated";
//        AdapterEvent adapterEvent = new AdapterEvent("c4357df7-2ad5-4d71-a774-27e3830bf02d", "PlannedCustomerChoiceWorkingPlanWasProcessed", "2020-02-29T22:41:51.828Z");
//        kafkaTemplate.send("projector.customerChoice.PlannedCustomerChoiceWorkingPlanWasProcessed.BR-aggregated", (String) adapterEvent.getEventId(), adapterEvent);
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceWasCreated.BRFS", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromWorkingPlanCreatedBRFS(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceWasCreated.GAP", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromWorkingPlanCreatedGAP(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceWasCreated.GO", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromWorkingPlanCreatedGO(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceWasCreated.ON", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromWorkingPlanCreatedON(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    /*********************************** WORKING PLAN UPDATED TOPICS LISTENERS ****************************************/

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceWasUpdated.BR", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromWorkingPlanUpdatedBR(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceWasUpdated.BRFS", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromWorkingPlanUpdatedBRFS(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceWasUpdated.GAP", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromWorkingPlanUpdatedGAP(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceWasUpdated.GO", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromWorkingPlanUpdatedGO(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceWasUpdated.ON", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromWorkingPlanUpdatedON(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    /*********************************** CURRENT PLAN SET TOPICS LISTENERS ****************************************/

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasSet.BR", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromCurrentPlanSetBR(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasSet.BRFS", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromCurrentPlanSetBRFS(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasSet.GAP", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromCurrentPlanSetGAP(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasSet.GO", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromCurrentPlanSetGO(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasSet.ON", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromCurrentPlanSetON(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }


    /*********************************** CURRENT PLAN UPDATED TOPICS LISTENERS ****************************************/

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasUpdated.BR", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromCurrentPlanUpdatedBR(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasUpdated.BRFS", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromCurrentPlanUpdatedBRFS(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasUpdated.GAP", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromCurrentPlanUpdatedGAP(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasUpdated.GO", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromCurrentPlanUpdatedGO(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasUpdated.ON", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromCurrentPlanUpdatedON(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    /*********************************** ORIGINAL PLAN SET TOPICS LISTENERS ****************************************/

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceOriginalPlanWasSet.BR", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromOriginalPlanSetBR(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceOriginalPlanWasSet.BRFS", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromOriginalPlanSetBRFS(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceOriginalPlanWasSet.GAP", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromOriginalPlanSetGAP(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceOriginalPlanWasSet.GO", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromOriginalPlanSetGO(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }

    @KafkaListener(topics = "planning.customerChoice.PlannedCustomerChoiceOriginalPlanWasSet.ON", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void readFromOriginalPlanSetON(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : " + key + " value : " + planningEvent.toString());
    }





}
