package com.vishaluplanch.avro.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class StockHistoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockHistoryApplication.class);
    }
}
