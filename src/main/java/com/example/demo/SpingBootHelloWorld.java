package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpingBootHelloWorld {

	@RequestMapping("/")
	public String hello() {
//		return "Hey, Spring Boot Hello World!";
		return "index";
	}
}
