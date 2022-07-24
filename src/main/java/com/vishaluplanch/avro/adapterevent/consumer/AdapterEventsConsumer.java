package com.vishaluplanch.avro.adapterevent.consumer;

import com.vishaluplanch.avro.schema.AdapterEvent;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AdapterEventsConsumer {

    @KafkaListener(topics = "testProjectorTopic2", containerFactory = "adapterEventsKafkaListenerContainerFactory")
    public void readFromTestProjectorTopic2(ConsumerRecord<String, String> record) {
        String key = record.key();
        String value = record.value();
        // AdapterEvent adapterEvent = record.value();
        System.out.println("SUCCESS message received for key : " + key + " value : " + record.value());
    }
}
