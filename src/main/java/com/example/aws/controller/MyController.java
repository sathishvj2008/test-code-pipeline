package com.example.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class MyController {
	
	@GetMapping("/all")
	public String getUser() {
		
		return "All user-sathish V J- new version";
	}

}
