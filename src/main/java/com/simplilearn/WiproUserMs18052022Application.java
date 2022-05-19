package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WiproUserMs18052022Application {

	public static void main(String[] args) {
		SpringApplication.run(WiproUserMs18052022Application.class, args);
	}

}
