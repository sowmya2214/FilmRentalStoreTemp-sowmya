package com.sprint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello/nithisha")
public class NithishaController {

	@GetMapping
	public String hello() {
		
		return "hello Nithisha";

	}

}
