package com.rays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringBootSimpleApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootSimpleApplication.class, args);
		

	}

	/*
	 * @Bean public WebMvcConfigurer corsConfig() { WebMvcConfigurer w = new
	 * WebMvcConfigurer() {
	 * 
	 * @Override public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/**").allowedOrigins("http://localhost:8080"); } };
	 * return w; }
	 */
	 
}