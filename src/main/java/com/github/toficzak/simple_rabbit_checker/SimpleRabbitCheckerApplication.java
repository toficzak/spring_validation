package com.github.toficzak.simple_rabbit_checker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Slf4j
@SpringBootApplication
public class SimpleRabbitCheckerApplication {

	@Profile("usage_message")
	@Bean
	public CommandLineRunner usage() {
		return args -> {
			log.info("This app uses Spring Profiles to control its behavior.");
			log.info("Sample usage: java -jar rabbit-tutorials.jar --spring.profiles.active=hello-world,sender");
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleRabbitCheckerApplication.class, args);
	}

}
