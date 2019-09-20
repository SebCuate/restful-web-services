package com.todos.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//GET
	//URI - /hello-world
	//method - "Hello World"
//	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		
		return "Hello World";
	}
	
	//Hello world with name
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean("Hello World");
	}
	
}
