package com.helios.watchstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	// same as @Configuration @EnableAutoConfiguration @ComponentScan, @Configuration scans for being definitions in the class and makes sures only one instance is created of the bean
public class WatchstoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(WatchstoreApplication.class, args);
	}
}
