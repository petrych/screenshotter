package com.petrych.screenshotter.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import static com.petrych.screenshotter.common.errorhandling.DateTimeConstants.LOCAL_DATETIME_SERIALIZER;

@Configuration
public class AppConfig {
	
	@Bean
	public Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder() {
		
		return new Jackson2ObjectMapperBuilder().serializers(LOCAL_DATETIME_SERIALIZER)
		                                        .serializationInclusion(JsonInclude.Include.NON_NULL);
	}
	
}
