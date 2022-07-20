package com.vishaluplanch.avro.kafka.producer;

import com.vishaluplanch.avro.schema.PlanningEvent;
import com.vishaluplanch.avro.schema.StockHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
public class PlanningEventsProducer {

    @Value("topicName")
    String topicName;

    @Autowired
    private KafkaTemplate<String, PlanningEvent> planningEventKafkaTemplate;

    public void send(PlanningEvent planningEvent) {
        ListenableFuture<SendResult<String, PlanningEvent>> future=  planningEventKafkaTemplate.send(topicName, String.valueOf(planningEvent.getPlannedCustomerChoiceId()), planningEvent);
        future.addCallback(new ListenableFutureCallback<SendResult<String, PlanningEvent>>() {
            @Override
            public void onFailure(Throwable ex) {
                System.out.println("Message failed to produce");
            }

            @Override
            public void onSuccess(SendResult<String, PlanningEvent> result) {
                System.out.println("Avro message successfully produced");
            }
        });

    }

}

