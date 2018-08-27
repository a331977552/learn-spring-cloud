package com.demo.feinclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;



@FeignClient("hello")
public interface FeignClientTest {

	@RequestMapping("/")
	String getResultFromDistributedServices();
	
}
