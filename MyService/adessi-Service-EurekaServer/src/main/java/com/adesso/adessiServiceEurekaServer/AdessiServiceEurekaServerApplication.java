package com.adesso.adessiServiceEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AdessiServiceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdessiServiceEurekaServerApplication.class, args);
	}
}
