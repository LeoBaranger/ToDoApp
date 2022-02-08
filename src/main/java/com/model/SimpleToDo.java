package com.model;

public class SimpleToDo {
	
    private int id;
    private String title, description;
    private boolean isDone;
    
    public SimpleToDo(String title, String description ) {
    	setTitle(title);
    	setDescription(description);
    }
    
    public SimpleToDo(String title) {
    	setTitle(title);
    }
    
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isDone() {
		return isDone;
	}
	
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

    

}