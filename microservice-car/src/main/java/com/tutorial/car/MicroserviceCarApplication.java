package com.tutorial.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceCarApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCarApplication.class, args);
	}

}
