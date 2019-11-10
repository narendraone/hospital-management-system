package com.narendra.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.narendra.*"})
@EntityScan(basePackages = {"com.narendra.*"})
@EnableJpaRepositories(basePackages = {"com.narendra.*"})
public class HMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(HMSApplication.class);
	}
}
