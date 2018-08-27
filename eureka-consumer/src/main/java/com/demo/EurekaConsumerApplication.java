package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
/**
 * enable feign REST client which will automatically apply load balancer 
 * if there is a ribbon plugin.
 * it will ask eureka registry to get the balanced service 
 * 
 * 
 * @author cody
 *
 */
@EnableFeignClients
public class EurekaConsumerApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerApplication.class, args);
	}
}
