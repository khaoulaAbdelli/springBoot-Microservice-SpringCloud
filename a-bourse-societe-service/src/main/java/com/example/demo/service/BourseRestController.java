package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BourseRestController {

	@Value("${me}")
	private String message;

	@RequestMapping("/messages")
	public String tellMe() {
		System.out.println("------------------------------");
		System.out.println("C´est moi qui repond");
		System.out.println("------------------------------");
		return message;

	}

}
