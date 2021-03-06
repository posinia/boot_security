package com.becky.securityboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@MapperScan("com.becky.securityboot.mappers")
public class SecuritybootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuritybootApplication.class, args);
	}
}
