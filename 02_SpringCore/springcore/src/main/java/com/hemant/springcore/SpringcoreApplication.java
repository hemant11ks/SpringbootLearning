package com.hemant.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// If we declare a Uitl package outside the .hemant then we need to use component scanning
/*
 @SpringBootApplication(
 scanBasePackages = {"com.hemant.springcore", "com.hemant.util"})
 */

@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}
	

}
