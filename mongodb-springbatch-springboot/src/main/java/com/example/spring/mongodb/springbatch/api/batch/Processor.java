package com.example.spring.mongodb.springbatch.api.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.example.spring.mongodb.springbatch.api.model.User;

@Component
public class Processor implements ItemProcessor<User, User> {

	@Override
	public User process(User user) throws Exception {
		System.out.println("Processing: " + user.toString());
        return user;
	}
}
