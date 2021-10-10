package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/qq")
public class SpingBootHelloWorld {

	@GetMapping("/x")
	public String hello() {
		return "Hey, Spring Boot Hello World!";
	}

	@GetMapping("/indexx")
	public String index() {
		return "indexx";
	}
}
