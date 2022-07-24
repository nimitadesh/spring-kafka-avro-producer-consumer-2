package com.vishaluplanch.avro.adapterevent.config;

import com.vishaluplanch.avro.schema.PlanningEvent;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

@Configuration
public class AdapterEventsConsumerConfig {

    @Bean
    public ConsumerFactory<String, PlanningEvent> adapterEventsConsumerFactory(KafkaProperties kafkaProperties) {
        return new DefaultKafkaConsumerFactory<>(kafkaProperties.buildConsumerProperties());
    }

    @Bean
    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, PlanningEvent>> adapterEventsKafkaListenerContainerFactory(KafkaProperties kafkaProperties) {
        ConcurrentKafkaListenerContainerFactory<String, PlanningEvent> factory = new ConcurrentKafkaListenerContainerFactory<String, PlanningEvent>();
        factory.setConsumerFactory(adapterEventsConsumerFactory(kafkaProperties));
        return factory;
    }
}


