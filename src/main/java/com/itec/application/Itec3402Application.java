package com.itec.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.itec.controller", "com.itec.services"})
@EntityScan(basePackages= {"com.itec.pojo"})
@EnableJpaRepositories(basePackages = {"com.itec.repo"})
public class Itec3402Application {

	public static void main(String[] args) {
		SpringApplication.run(Itec3402Application.class, args);
	}

}
