package com.brite.kakfaproducer.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ProducerConfig {


    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name("producer-location")
                .build();
    }
}
