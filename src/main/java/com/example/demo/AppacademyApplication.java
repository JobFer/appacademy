package com.example.demo;


import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppacademyApplication {
	
	private static final Logger log = Logger.getLogger(AppacademyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AppacademyApplication.class, args);
	}
	
}
