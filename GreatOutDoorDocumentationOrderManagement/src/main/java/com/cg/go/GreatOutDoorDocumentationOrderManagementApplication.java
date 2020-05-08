package com.cg.go;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class GreatOutDoorDocumentationOrderManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreatOutDoorDocumentationOrderManagementApplication.class, args);
	}

}
