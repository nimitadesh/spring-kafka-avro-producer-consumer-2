package com.vishaluplanch.avro.adapterevent.controller;

import com.vishaluplanch.avro.adapterevent.model.AdapterEventModel;
import com.vishaluplanch.avro.adapterevent.producer.AdapterEventsProducer;
import com.vishaluplanch.avro.schema.AdapterEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdapterEventsConsumerRestController {

    @Autowired
    private AdapterEventsProducer adapterEventsProducer;

//    @PostMapping(value = "/sendAdapterEvent")
//    public void sendStockHistory(@RequestBody AdapterEventModel adapterEventModel) {
//
//        AdapterEvent adapterEvent = AdapterEvent.newBuilder().build();
//
//        adapterEvent.setEventId(adapterEventModel.getEventId());
//        adapterEvent.setEventType(adapterEventModel.getEventType());
//        adapterEvent.setPublishedDate(adapterEventModel.getPublishedDate());
//
//        adapterEventsProducer.send(adapterEvent);
//    }
}
