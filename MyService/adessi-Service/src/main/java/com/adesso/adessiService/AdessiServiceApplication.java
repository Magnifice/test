package com.adesso.adessiService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AdessiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdessiServiceApplication.class, args);
	}
}
