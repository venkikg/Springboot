package com.victory.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootM1CloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootM1CloudConfigApplication.class, args);
	}
	
	@RequestMapping("/greetings")
	public String sayHello() {
		
		return "Hi this my first spring boot application";
	}
}
