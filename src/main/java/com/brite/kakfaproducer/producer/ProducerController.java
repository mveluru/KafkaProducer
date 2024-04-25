package com.brite.kakfaproducer.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(path="/producer")
public class ProducerController {

    private ProducerService producerService;

    @Autowired
    public void setProducerService(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping(path="/location")
    public ResponseEntity producerLocation() throws InterruptedException{

      int range = 100;
        while (range>=0){
        producerService.updateproducerlocation(Math.random()+","+Math.random());
            Thread.sleep(300);
            range--;
        }
        return  new ResponseEntity<>(Map.of("Austin Texas","https://kafka.apache.org/quickstart" ),HttpStatus.OK);
    }
}
