package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.boot.autoconfigure.SpringBootApplication
@ComponentScan("com.example.controller") // Optional
public class SpringBootApplication {

	/**
	 How multiple requests work with-out credentials ??
	 JSESSIONID cookie --> by default spring-security will create the jsessionid for all the logged-in users( this is default behaviour,
	 there are advanced ways of doing this --> oauth2, jwt etc.)
	*/

	// By-default spring security will all the apis in the application
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}

}
