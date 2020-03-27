package com.helios.watchstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication	// same as @Configuration @EnableAutoConfiguration @ComponentScan, @Configuration scans for being definitions in the class and makes sures only one instance is created of the bean
public class WatchstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(WatchstoreApplication.class, args);
	}
	/*Spring Boot provides two interfaces, CommandLineRunner and ApplicationRunner, to run specific
	pieces of code when an application is fully started. These interfaces get called just before run()
	once SpringApplication completes. The application first gets a CommandLineRunner bean it executes
	it before application startup on it's own. This is a lambda expression which returns an implementation
	for the run method of functional interface CommandLineRunner*/
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}

	@Bean
	public String sayHello() {
		return "Hello";
	}

}
