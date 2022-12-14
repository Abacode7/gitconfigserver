package com.example.gitconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class GitconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitconfigserverApplication.class, args);
	}

}
