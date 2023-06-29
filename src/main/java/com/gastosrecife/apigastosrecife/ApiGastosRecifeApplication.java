package com.gastosrecife.apigastosrecife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ApiGastosRecifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGastosRecifeApplication.class, args);
	}

}
