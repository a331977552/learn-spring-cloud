package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	@Autowired
	DiscoveryClient  client;
	
	
	@RequestMapping("/")
	public String index() {
		List<ServiceInstance> services = client.getInstances("${spring.application.name}");
		return "sssss"+1+services.toString();
	}
}
