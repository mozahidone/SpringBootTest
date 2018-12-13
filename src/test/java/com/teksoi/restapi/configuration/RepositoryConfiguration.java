package com.teksoi.restapi.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.teksoi.restapi.model"})
@EnableJpaRepositories(basePackages = {"com.teksoi.restapi.repository"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
