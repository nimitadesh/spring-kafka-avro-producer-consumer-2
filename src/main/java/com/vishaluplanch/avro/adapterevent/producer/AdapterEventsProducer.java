package com.vishaluplanch.avro.adapterevent.producer;

// import com.sun.jndi.toolkit.url.Uri;
import com.vishaluplanch.avro.schema.AdapterEvent;
import com.vishaluplanch.avro.schema.PlanningEvent;
import io.swagger.models.HttpMethod;
import org.apache.kafka.common.Uuid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
public class AdapterEventsProducer {

    @Value("testPlanningTopic2")
    String topicName;

    @Autowired
    private KafkaTemplate<String, AdapterEvent> adapterEventsProducerKafkaTemplate;

    public void send(AdapterEvent adapterEvent) {
        ListenableFuture<SendResult<String, AdapterEvent>> future = adapterEventsProducerKafkaTemplate.send(topicName, String.valueOf(adapterEvent.getEventId()), adapterEvent);
        future.addCallback(new ListenableFutureCallback<SendResult<String, AdapterEvent>>() {
            @Override
            public void onFailure(Throwable ex) {
                System.out.println("Message failed to produce");
            }

            @Override
            public void onSuccess(SendResult<String, AdapterEvent> result) {
                System.out.println("Avro message successfully produced");
            }
        });

    }



}

