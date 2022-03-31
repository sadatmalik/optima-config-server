package com.sadatmalik.optima.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring Cloud service bootstrap class that we can use to launch the service.
 *
 * The @EnableConfigServer class annotation enables the service as a Spring Cloud Config service.
 *
 * @author sadatmalik
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
