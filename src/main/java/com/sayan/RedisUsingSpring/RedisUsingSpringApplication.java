package com.sayan.RedisUsingSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisUsingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisUsingSpringApplication.class, args);
	}

}
