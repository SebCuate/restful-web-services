package com.todos.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import classes.HelloWorldBean;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/helloBean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping(path = "/helloBean/variable/{name}")
	public HelloWorldBean helloWorldPV(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello %s", name));
	}
	
}
