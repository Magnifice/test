package com.adesso.adessiConfigService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AdessiConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdessiConfigServiceApplication.class, args);
	}
}
