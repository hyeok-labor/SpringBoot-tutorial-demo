package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	@RequestMapping("/")		// defualt root
	public String hello() {
		String json = "ㅁㅁㅁㅁㅁ";
		return "Hello World!";
	}
}
