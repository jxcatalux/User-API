package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("hello-world-bean")
	public String helloWorldBean() {
		final HelloWorldBean bean = new HelloWorldBean("Hello World Bean");
		
		return bean.getMessage();
		
	}
}
