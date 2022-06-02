package com.portfolio.portfolioSpringBoot;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
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
				registry.addMapping("/**")
                                        .allowedOrigins("http://portfolio-arg-programa.web.app/")
                                           .exposedHeaders("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials")
                                        .allowedMethods("*")
                                        .allowedHeaders("*");
                                registry.addMapping("/**")
                                        .allowedOrigins("http://localhost:4200/")
                                          .exposedHeaders("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials")
                                        .allowedMethods("*")
                                        .allowedHeaders("*");
			}
		};
	}
        
        //@Bean
        //public CorsFilter corsFilter() {
            
        //CorsConfiguration corsConfiguration = new CorsConfiguration();
        //corsConfiguration.setAllowCredentials(true);
        //corsConfiguration.setAllowedOrigins(Arrays.asList("http://portfolio-arg-programa.web.app/"));
        //corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200/"));
        //corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
        //"Accept", "Authorization", "Origin, Accept", "X-Request-With",
        //"Access-Control-Request-Method", "Access-Control-Request-Headers"));
        //corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-type", "Accept", "Authorization",
        //"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
        //corsConfiguration.setAllowedMethods(Arrays.asList("GET", "PUT", "POST", "DELETE", "OPTIONS"));
        //UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        //urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        //return new CorsFilter(urlBasedCorsConfigurationSource);
        //}
        
        
        //@Configuration
        //@ComponentScan(basePackageClasses = AppConfig.class, useDefaultFilters = false, includeFilters = {
        //@Filter(org.springframework.stereotype.Controller.class) })
        //@EnableWebMvc
        //    public class WebConfig extends WebMvcConfigurerAdapter {

        //    @Override
        //    public void addCorsMappings(CorsRegistry registry) {
        //    registry.addMapping("/*").allowedOrigins("*").allowedMethods("GET", "POST", "OPTIONS", "PUT")
        //    .allowedHeaders("Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
        //     "Access-Control-Request-Headers")
        //    .exposedHeaders("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials")
        //    .allowCredentials(true).maxAge(3600);
    //}

//}
}
