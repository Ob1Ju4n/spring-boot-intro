package com.ob1ju4n.rsad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SpringCoreFundamentalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreFundamentalsApplication.class, args);
	}
}
