package com.portfolio.portfolioSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PortfolioSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioSpringBootApplication.class, args);
	}
        
        @Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://portfolio-arg-programa.web.app").allowedMethods("*").allowedHeaders("*");
			}
		};
	}
}
