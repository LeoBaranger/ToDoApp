package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ToDoService;
import com.model.SimpleToDo;

public class ToDoServiceTest {

	@Test
	public final void testGetToDos() {
		ToDoService tds = new ToDoService();
		
		List<SimpleToDo> todos = tds.getToDos();
		
		assertNotNull("list not initialized", todos);

		assertFalse("no todos", todos.isEmpty());

		assertFalse("missing hard-coded todos", todos.size() < 3);
        
	}
	
	@Test
	public final void testCHangeState() {
		ToDoService tds = new ToDoService();
		
		SimpleToDo todo = new SimpleToDo("test title");
		
		tds.changeState(todo);
		
		assertFalse("fail done state", !todo.isDone());
        
	}
	
	@Test
	public final void testgetToDo() {

		ToDoService tds = new ToDoService();
		
		SimpleToDo res = tds.getToDo("US3");
		
		assertNotNull("existing todo not found", res);

		assertFalse("wrong todo", res.getTitle() != "US3");
		
	}
	
	@Test
	public final void testCreateToDo() {

		ToDoService tds = new ToDoService();
		
		List<SimpleToDo> res = tds.createToDo("US4", null);
		
		SimpleToDo td = null;
		for(SimpleToDo todo : res) {
        	if(todo.getTitle() == "US4") {
        		td = todo;
        	}
        }
		
		assertNotNull("todo not created", td);

	}

}