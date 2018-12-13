package com.teksoi.restapi.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

/**
 * Created by Mozahid on Jul 24, 2018
 */
@Configuration
public class BeanConfiguration {

	@Bean
	@RequestScope
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}

}
