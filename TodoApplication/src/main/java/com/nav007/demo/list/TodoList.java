package com.nav007.demo.list;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TodoList {
    
	@Id
    @GeneratedValue
	private int id;
	private String content;
	

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return   content;
	}  
	
	
}
