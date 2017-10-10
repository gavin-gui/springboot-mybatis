package com.example.demo;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.jms.Queue;
import javax.jms.Topic;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	Queue queue() {
		return new ActiveMQQueue("my.queue");
	}

	@Bean
	Topic topic() {
		return new ActiveMQTopic("my.topic");
	}
}
