package com.nav007.demo.list.interf;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nav007.demo.list.TodoList;

public interface ListRepo extends JpaRepository<TodoList, Integer> {

	

	

}
