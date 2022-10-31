package com.kafka.study;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class KafkaProducerStudy {
    public static void main(String[] args) {
         Properties properties = new Properties();
         properties.put("bootstrap.servers", "192.168.46.130:9092");
         properties.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
         properties.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer");
         properties.put("retries",1);
        final KafkaProducer<String,String> kafkaProducer = new KafkaProducer<>(properties);
        final ProducerRecord<String,String> producerRecord = new ProducerRecord("mrt","sssss");
        kafkaProducer.send(producerRecord);
        kafkaProducer.close();
    }
}
