package com.vishaluplanch.avro.planningevent.producer;

// import com.sun.jndi.toolkit.url.Uri;
import com.vishaluplanch.avro.schema.PlanningEvent;
import io.swagger.models.HttpMethod;
import org.apache.kafka.common.Uuid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
// import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
// @EnableKafkaStreams
public class PlanningEventsProducer {

    @Value("testPlanningTopic2")
    String topicName;

    @Autowired
    private KafkaTemplate<String, PlanningEvent> planningEventsProducerKafkaTemplate;

    public void send(PlanningEvent planningEvent) {
        ListenableFuture<SendResult<String, PlanningEvent>> future = planningEventsProducerKafkaTemplate.send(topicName, String.valueOf(planningEvent.getEventId()), planningEvent);
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

