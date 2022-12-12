package com.actuator.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class JenkinsSpringBootApplication {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinsSpringBootApplication.class);
	
	@GetMapping("/hello")
	public String hello() {
		logger.info("Application started in controller ........");
		return "hello world";
	}
	
	@PostConstruct
	public void init() {
		logger.info("Application started ........");
	}
	

	public static void main(String[] args) {
		logger.info("Application executed ........");
		SpringApplication.run(JenkinsSpringBootApplication.class, args);
	}

}
