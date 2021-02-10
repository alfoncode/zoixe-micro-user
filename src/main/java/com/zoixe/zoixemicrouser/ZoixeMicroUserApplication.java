package com.zoixe.zoixemicrouser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ZoixeMicroUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoixeMicroUserApplication.class, args);
	}

}
