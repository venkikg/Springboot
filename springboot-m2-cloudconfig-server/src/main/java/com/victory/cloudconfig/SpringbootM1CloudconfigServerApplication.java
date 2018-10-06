package com.victory.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringbootM1CloudconfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootM1CloudconfigServerApplication.class, args);
	}
}
