package com.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopProjectApplication.class, args);
	}

}
