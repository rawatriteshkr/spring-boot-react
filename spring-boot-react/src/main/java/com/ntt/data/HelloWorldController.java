package com.ntt.data;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@CrossOrigin(origins = {"http://localhost:3000"})
	@GetMapping(value = "/sayhello")
	public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
		return "Hello " + name;
	}
}
