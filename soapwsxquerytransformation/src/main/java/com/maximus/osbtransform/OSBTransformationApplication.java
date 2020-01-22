package com.maximus.osbtransform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.maximus.osbtransform")
public class OSBTransformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OSBTransformationApplication.class, args);
	}

}
