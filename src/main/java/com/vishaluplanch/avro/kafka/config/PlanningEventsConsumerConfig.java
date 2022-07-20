package com.vishaluplanch.avro.kafka.config;

import com.vishaluplanch.avro.schema.PlanningEvent;
import com.vishaluplanch.avro.schema.StockHistory;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

@Configuration
public class PlanningEventsConsumerConfig {

    @Bean
    public ConsumerFactory<String, PlanningEvent> planningEventsConsumerFactory(KafkaProperties kafkaProperties) {
        return new DefaultKafkaConsumerFactory<>(kafkaProperties.buildConsumerProperties());
    }

    @Bean
    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, PlanningEvent>> planningEventsKafkaListenerContainerFactory(KafkaProperties kafkaProperties) {
        ConcurrentKafkaListenerContainerFactory<String, PlanningEvent> factory = new ConcurrentKafkaListenerContainerFactory<String, PlanningEvent>();
        factory.setConsumerFactory(planningEventsConsumerFactory(kafkaProperties));
        return factory;
    }
}

