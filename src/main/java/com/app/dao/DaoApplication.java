package com.app.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.app.entities, com.app.dao")
public class DaoApplication {

	public static void main(String[] args) {
            SpringApplication.run(DaoApplication.class, args);
            System.out.println("****************");
	}

}
