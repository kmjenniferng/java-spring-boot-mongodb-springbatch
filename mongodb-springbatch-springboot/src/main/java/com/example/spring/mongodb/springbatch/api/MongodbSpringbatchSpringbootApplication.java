package com.example.spring.mongodb.springbatch.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MongodbSpringbatchSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbSpringbatchSpringbootApplication.class, args);
	}
}
