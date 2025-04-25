package com.ibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootSecondAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecondAppApplication.class, args);
	}
	/*
	 * Create RestTemplate object with @LoadBalanced configuration so
	 * that it will registered in the spring container with load balancer, any HTTP request
	 * you make will be from RestTemplate will be using LoadBalancer
	 */
	@Bean
	@LoadBalanced
	public RestTemplate createRest() {
		return new RestTemplate();
	}

}
