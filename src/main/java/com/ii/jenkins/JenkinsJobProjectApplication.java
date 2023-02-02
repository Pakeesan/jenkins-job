package com.ii.jenkins;

import java.util.logging.Logger;

import org.apache.juli.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsJobProjectApplication {
	
	public static org.slf4j.Logger logger=LoggerFactory.getLogger(JenkinsJobProjectApplication.class);
	
	@PostConstruct
	public void init() {
		System.out.println("Hello");
		System.out.println("welcome to jenkins ");
		logger.info("hello");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsJobProjectApplication.class, args);
	}

}
