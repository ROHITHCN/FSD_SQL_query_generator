package com.fsd.RdbmsDML;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RdbmsDmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(RdbmsDmlApplication.class, args);
	}

}
