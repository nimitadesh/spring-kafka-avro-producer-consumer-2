package com.vishaluplanch.avro.planningevent.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * The KafkaTopicConfig class is responsible for creating topics.
 */

@Configuration
public class PlanningEventTopicsConfig {

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic testPlanningTopic() {
        return TopicBuilder.name("testPlanningTopic").build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic testPlanningTopic2() {
        return TopicBuilder.name("testPlanningTopic2").build();
    }

    /************************ WORKING PLAN CREATED TOPICS ************************/

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanCreatedBR() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceWasCreated.BR")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanCreatedBRFS() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceWasCreated.BRFS")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanCreatedGAP() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceWasCreated.GAP")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanCreatedGO() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceWasCreated.GO")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanCreatedON() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceWasCreated.ON")
                .build();
    }

    /************************ WORKING PLAN UPDATED TOPICS ************************/

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanUpdatedBR() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceWasUpdated.BR")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanUpdatedBRFS() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceWasUpdated.BRFS")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanUpdatedGAP() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceWasUpdated.GAP")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanUpdatedGO() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceWasUpdated.GO")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic workingPlanUpdatedON() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceWasUpdated.ON")
                .build();
    }

    /************************ CURRENT PLAN SET TOPICS ************************/

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic currentPlanSetBR() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasSet.BR")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic currentPlanSetBRFS() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasSet.BRFS")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic currentPlanSetGAP() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasSet.GAP")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic currentPlanSetGO() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasSet.GO")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic currentPlanSetON() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasSet.ON")
                .build();
    }

    /************************ CURRENT PLAN UPDATED TOPICS ************************/

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic currentPlanUpdatedBR() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasUpdated.BR")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic currentPlanUpdatedBRFS() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasUpdated.BRFS")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic currentPlanUpdatedGAP() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasUpdated.GAP")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic currentPlanUpdatedGO() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasUpdated.GO")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic currentPlanUpdatedON() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceCurrentPlanWasUpdated.ON")
                .build();
    }

    /************************ ORIGINAL PLAN SET TOPICS ************************/

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic originalPlanSetBR() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceOriginalPlanWasSet.BR")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic originalPlanSetBRFS() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceOriginalPlanWasSet.BRFS")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic originalPlanSetGAP() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceOriginalPlanWasSet.GAP")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic originalPlanSetGO() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceOriginalPlanWasSet.GO")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic originalPlanSetON() {
        return TopicBuilder.name("planning.customerChoice.PlannedCustomerChoiceOriginalPlanWasSet.ON")
                .build();
    }

    /************************ DEAD LETTER TOPIC ************************/

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic deadLetterTopic() {
        return TopicBuilder.name("deadLetterTopic").build();
    }
}
