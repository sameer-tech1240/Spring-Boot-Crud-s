package com.test.boot;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SameerSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SameerSpringBootApplication.class, args);
		log.info("Project started...");
	}

}
