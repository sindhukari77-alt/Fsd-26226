package com.janu.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroproductservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroproductservicesApplication.class, args);
	}

}
