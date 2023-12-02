package com.example.SpringBoot4.SpringBoot4;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class SpringBoot4Application extends SpringBootServletInitializer{

	  @Override
	    protected SpringApplicationBuilder configure(
	      SpringApplicationBuilder builder) {
	        return builder.sources(SpringBoot4Application.class);
	    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot4Application.class, args);
	}

}
