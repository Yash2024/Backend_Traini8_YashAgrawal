package com.yash.traini8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})  // Exclude DataSource auto-configuration
@EnableMongoRepositories(basePackages = "com.yash.traini8.Repository")
public class Traini8Application {

	public static void main(String[] args) {
		SpringApplication.run(Traini8Application.class, args);
	}

}
