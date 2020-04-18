package com.hr.base;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.hr")).build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
	    return new ApiInfo(
	      "HR App REST API", 
	      "This is the back end HR APIs provied by spring boot ", 
	      "API TOS", 
	      "Terms of service", 
	      new Contact("Nour Shaheen", "www.example.com", "developer.nour@gmail.com"), 
	      "License of API", "API license URL", Collections.emptyList());
	}


}
