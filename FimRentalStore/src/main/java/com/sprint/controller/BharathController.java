package com.sprint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Bharath")
public class BharathController {

	@GetMapping
	public String hello() {
		return "Hello Hyderabad...";
		
	}
}
