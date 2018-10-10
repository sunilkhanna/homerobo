package org.sunillab.robo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication 
public class AutoroboApplication extends SpringBootServletInitializer{
 
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AutoroboApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AutoroboApplication.class, args);
	}
}
