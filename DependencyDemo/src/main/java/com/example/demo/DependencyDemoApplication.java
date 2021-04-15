package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.utils.Customers;

@SpringBootApplication
public class DependencyDemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = 	SpringApplication.run(DependencyDemoApplication.class, args);
	Customers customers = context.getBean(Customers.class);
	customers.display();
	
	}

}
