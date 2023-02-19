package com.nav007.demo.list.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nav007.demo.list.TodoList;
import com.nav007.demo.list.interf.ListRepo;

@Controller
public class ToDoController {
  
	@Autowired
	ListRepo repo;  
	
	@RequestMapping("/")
	public ModelAndView list() {
		List<TodoList> toDo = repo.findAll();
		ModelAndView mv = new ModelAndView("ToDo.jsp");
		mv.addObject("list", toDo);
	    return mv; 
	}
	@RequestMapping("/add")
	public ModelAndView Addlist(TodoList list) {
		repo.save(list);
		List<TodoList> toDo = repo.findAll();
		ModelAndView mv = new ModelAndView("ToDo.jsp");
		mv.addObject("list", toDo);
	    return mv;
	} 
	@RequestMapping("/delete")
	public ModelAndView dellist(int id) {
		repo.deleteById(id);
		List<TodoList> toDo = repo.findAll();
		ModelAndView mv = new ModelAndView("ToDo.jsp");
		mv.addObject("list", toDo);
	    return mv;
	}
}    
/*  <%
   
   %>*/
