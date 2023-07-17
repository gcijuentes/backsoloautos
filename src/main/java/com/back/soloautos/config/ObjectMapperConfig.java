package com.back.soloautos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

@Configuration
public class ObjectMapperConfig {

	@Bean
	@Primary
	public ObjectMapper objectMapper(final Jackson2ObjectMapperBuilder builder) {
		
		return builder.createXmlMapper(false)
				.serializationInclusion(Include.NON_NULL)
				.propertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
				.build();
	}
	
	
}
