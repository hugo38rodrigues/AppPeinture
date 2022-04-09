package com.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
@Slf4j
public class SpringbootApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApiRestApplication.class, args);
	}

}
