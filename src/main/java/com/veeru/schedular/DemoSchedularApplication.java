package com.veeru.schedular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoSchedularApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSchedularApplication.class, args);
	}

}
