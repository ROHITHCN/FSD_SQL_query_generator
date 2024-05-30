package com.fsd.RdbmsDDL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RdbmsDdlApplication {

	public static void main(String[] args) {
		SpringApplication.run(RdbmsDdlApplication.class, args);
	}

}
