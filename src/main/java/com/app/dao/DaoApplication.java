package com.app.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages={
		"com.app.dao", "com.app.entities"})
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.app.entities, com.app.dao")
@EnableJpaRepositories(basePackages="com.app.entities, com.app.dao")
@EnableTransactionManagement
@EntityScan(basePackages = "com.app.entities, com.app.dao")
public class DaoApplication {

	public static void main(String[] args) {
            SpringApplication.run(DaoApplication.class, args);
            System.out.println("****************");
	}

}
