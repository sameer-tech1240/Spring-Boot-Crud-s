package com.security.jwt.crud.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class Beans{

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

}
