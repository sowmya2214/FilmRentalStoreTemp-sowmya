package com.sprint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aniket")
public class AniketController {
	
	@GetMapping
	public String sayHello() {
		return "Hello ";
		
	}
}