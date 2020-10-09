package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Product {

	public static void main(String[] args) {
		SpringApplication.run(Product.class, args);
	}

	public Product() {
		
		System.out.println("Inside Product..");
	}
}
