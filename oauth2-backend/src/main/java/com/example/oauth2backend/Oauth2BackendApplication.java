package com.example.oauth2backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@EnableGlobalMethodSecurity(jsr250Enabled = true)
@SpringBootApplication(exclude = ReactiveUserDetailsServiceAutoConfiguration.class)
public class Oauth2BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2BackendApplication.class, args);
	}

}
