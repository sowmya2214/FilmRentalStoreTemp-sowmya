package com.sprint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class VijayController {

	@GetMapping
	public static void hello() {
		System.out.println("Hello..!");
	}
}
