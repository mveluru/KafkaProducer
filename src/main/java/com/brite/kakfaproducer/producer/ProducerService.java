package com.brite.kakfaproducer.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Service
public class ProducerService {

    private static final String PRODUCER_LOCATION = "producer-location";
    private KafkaTemplate<String,Object> kafkaTemplate;

    @Autowired
    public void setKafkaTemplate(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public boolean updateproducerlocation(String location){
        kafkaTemplate.send(PRODUCER_LOCATION,location);
        return true;
    }
}
