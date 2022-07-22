package com.tola.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TolaApplication.class, args);
	}

}
