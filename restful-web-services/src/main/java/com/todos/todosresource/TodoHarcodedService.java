package com.todos.todosresource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHarcodedService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static int idCounter = 0;
	static {
		todos.add(new Todo(++idCounter, "elCuato", "Learn Angular",  new Date(), false));
		todos.add(new Todo(++idCounter, "elCuato", "Learn Spring",  new Date(), false));
		todos.add(new Todo(++idCounter, "elCuato", "Learn Microservices",  new Date(), false));
		todos.add(new Todo(++idCounter, "elCuato", "Visit some place",  new Date(), false));
		todos.add(new Todo(++idCounter, "elCuato", "Walk in a park",  new Date(), false));
		todos.add(new Todo(++idCounter, "elCuato", "Visit my family",  new Date(), false));
		todos.add(new Todo(++idCounter, "laOrtega", "Learn Angular",  new Date(), false));
		todos.add(new Todo(++idCounter, "laOrtega", "Learn Spring",  new Date(), false));
		todos.add(new Todo(++idCounter, "laOrtega", "Learn Microservices",  new Date(), false));
		todos.add(new Todo(++idCounter, "laOrtega", "Visit some place",  new Date(), false));
		todos.add(new Todo(++idCounter, "laOrtega", "Walk in a park",  new Date(), false));
		todos.add(new Todo(++idCounter, "laOrtega", "Visit my family",  new Date(), false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public List<Todo> findAll(String username){
		
		List<Todo> todosByUsername = new ArrayList<>();
		
		for (Todo todo : todos) {
			if(todo.getUsername().equalsIgnoreCase(username))
				todosByUsername.add(todo);
		}
		return todosByUsername;
	}
	
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		todos.remove(todo);
		return todo;
	}

	public Todo findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
