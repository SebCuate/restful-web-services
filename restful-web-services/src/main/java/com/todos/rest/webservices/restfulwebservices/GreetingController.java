package com.todos.rest.webservices.restfulwebservices;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import classes.Greeting;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/empty")
    public String saludosVacios(@RequestParam(value="count", defaultValue="1") int count) {
    	if(count == 1)
    		return "Hola desconocido, el contador es " +  counter.addAndGet(1);
    	else 
    		counter.set(count);
    	return "Hola desconocido, has puesto el contador en " + counter.get() ;
    }
    
}