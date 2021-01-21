package com.itec.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.itec.controller", "com.itec.services"})
public class Itec3402Application {

	public static void main(String[] args) {
		SpringApplication.run(Itec3402Application.class, args);
	}

}
