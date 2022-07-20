package com.vishaluplanch.avro.kafka.consumer;

import com.vishaluplanch.avro.schema.PlanningEvent;
import com.vishaluplanch.avro.schema.StockHistory;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PlanningEventsConsumer {

    @KafkaListener(topics = "topicName", containerFactory = "planningEventsKafkaListenerContainerFactory")
    public void read(ConsumerRecord<String, PlanningEvent> record) {
        String key = record.key();
        PlanningEvent planningEvent = record.value();
        System.out.println("Avro message received for key : "+key+ " value : " + planningEvent.toString());
    }

}
