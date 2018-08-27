package com.demo.controller;

import javax.jws.WebResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.feinclient.FeignClientTest;


@Controller
public class HomeController {

	
	@Autowired
	FeignClientTest clientTest;
	
	@RequestMapping("/")
	@ResponseBody
	public String getResult() {
		//business logical code
		return clientTest.getResultFromDistributedServices();
	}
	
	
}
