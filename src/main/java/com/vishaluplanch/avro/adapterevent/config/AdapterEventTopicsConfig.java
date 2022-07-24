package com.vishaluplanch.avro.adapterevent.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * The KafkaTopicConfig class is responsible for creating topics.
 */

@Configuration
public class AdapterEventTopicsConfig {

    /**
     * The amigoscodeTopic() method builds and returns a new topic named "amigoscode".
     * @return a new topic of type NewTopic
     */

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic testProjectorTopic() {
        return TopicBuilder.name("testProjectorTopic")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanBRAggregated() {
        return TopicBuilder.name("projector.customerChoice.PlannedCustomerChoiceWorkingPlanWasProcessed.BR-aggregated")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanBRFSAggregated() {
        return TopicBuilder.name("projector.customerChoice.PlannedCustomerChoiceWorkingPlanWasProcessed.BRFS-aggregated")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanGAPAggregated() {
        return TopicBuilder.name("projector.customerChoice.PlannedCustomerChoiceWorkingPlanWasProcessed.GAP-aggregated")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanGOAggregated() {
        return TopicBuilder.name("projector.customerChoice.PlannedCustomerChoiceWorkingPlanWasProcessed.GO-aggregated")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanONAggregated() {
        return TopicBuilder.name("projector.customerChoice.PlannedCustomerChoiceWorkingPlanWasProcessed.ON-aggregated")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanBRStoreSizeLevel() {
        return TopicBuilder.name("projector.customerChoice.PlannedCustomerChoiceWorkingPlanWasProcessed.BR-storesizelevel")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanBRFSStoreSizeLevel() {
        return TopicBuilder.name("projector.customerChoice.PlannedCustomerChoiceWorkingPlanWasProcessed.BRFS-storesizelevel")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanGAPStoreSizeLevel() {
        return TopicBuilder.name("projector.customerChoice.PlannedCustomerChoiceWorkingPlanWasProcessed.GAP-storesizelevel")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanGOStoreSizeLevel() {
        return TopicBuilder.name("projector.customerChoice.PlannedCustomerChoiceWorkingPlanWasProcessed.GO-storesizelevel")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanONStoreSizeLevel() {
        return TopicBuilder.name("projector.customerChoice.PlannedCustomerChoiceWorkingPlanWasProcessed.ON-storesizelevel")
                .build();
    }
}

