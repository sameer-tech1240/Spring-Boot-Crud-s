package com.security.jwt.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudWithSecurityAndJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudWithSecurityAndJwtApplication.class, args);
		System.out.println("running.....!");
	}

}
