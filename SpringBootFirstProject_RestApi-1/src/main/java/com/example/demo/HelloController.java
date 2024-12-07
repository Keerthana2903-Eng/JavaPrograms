package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	//localhost:8096/hello
	@GetMapping("/hello")
	public String helloWorld()
	{
		return "Hello World";
	}
}
