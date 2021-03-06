package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.SpringServletContainerInitializer;

@ComponentScan
@SpringBootApplication
public class SubmissionFormApplication extends SpringServletContainerInitializer {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
		return springApplicationBuilder.sources(SubmissionFormApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SubmissionFormApplication.class, args);
	}

}
