package com.tutorial.bike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceBikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBikeApplication.class, args);
	}

}
