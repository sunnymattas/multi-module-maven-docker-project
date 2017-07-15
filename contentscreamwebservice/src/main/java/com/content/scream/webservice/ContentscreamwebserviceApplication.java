package com.content.scream.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.content.scream")
public class ContentscreamwebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentscreamwebserviceApplication.class, args);
	}
}
