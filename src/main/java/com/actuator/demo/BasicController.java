package com.actuator.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

	@GetMapping("/hello")
	public String getData() {
		return "WelcomeToLoveToLearn";
	}
}
