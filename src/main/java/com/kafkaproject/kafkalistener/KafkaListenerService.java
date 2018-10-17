package com.kafkaproject.kafkalistener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafkaproject.model.Person;

@Service
public class KafkaListenerService {
	
	@KafkaListener(topics = {"test"})
	public void consume(Person person){
		
		System.out.println(person);
	}

}
