package com.adesso.adessizuulproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class AdessiZuulProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdessiZuulProxyApplication.class, args);
	}
}
