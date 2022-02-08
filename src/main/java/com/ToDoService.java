package com;


import java.util.ArrayList;
import java.util.List;

import com.model.SimpleToDo;


public class ToDoService {

    public List<SimpleToDo> getToDos(){

        List<SimpleToDo> todos = new ArrayList<SimpleToDo>();

        todos.add(new SimpleToDo("US1"));
        todos.add(new SimpleToDo("US2"));
        todos.add(new SimpleToDo("US3"));

        
        return todos;
    }
    
    public void changeState(SimpleToDo todo) {
    	todo.setDone(true);
    }
    
    public SimpleToDo getToDo(String title){

        List<SimpleToDo> todos = new ArrayList<SimpleToDo>();

        todos.add(new SimpleToDo("US1"));
        todos.add(new SimpleToDo("US2"));
        todos.add(new SimpleToDo("US3"));
        
        
        for(SimpleToDo todo : todos) {
        	if(todo.getTitle() == title) {
        		return todo;
        	}
        }

        
        return null;
    }
    
    public List<SimpleToDo> createToDo(String title, String desc){
    	
    	
    	List<SimpleToDo> todos = new ArrayList<SimpleToDo>();

        todos.add(new SimpleToDo("US1"));
        todos.add(new SimpleToDo("US2"));
        todos.add(new SimpleToDo("US3"));
        
        if(title == null) {
        	return null;
        }

        SimpleToDo todo = new SimpleToDo(title, desc);
        todos.add(todo);

        return todos;
    }
}
