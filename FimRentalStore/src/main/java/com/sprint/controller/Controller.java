package com.sprint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controller {

	@RestController
	@RequestMapping
	public class HelloController {

		@GetMapping
		public String sayHello() {
			return "hellooo";
		}
	}

}
