package com.msi.jenkins.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	
	private static final Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	public static void main(String[] args) {
		log.info("Application excuted............");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}
	@PostConstruct
	public void intt()
	{
		
		log.info("Application Started!............");
	}
}
