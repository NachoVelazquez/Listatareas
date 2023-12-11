package com.CMEPPS.listatareas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CMEPPS.listatareas.model.ListTodo;

public interface ListTodoRepository extends JpaRepository<ListTodo, Long>{
	List < ListTodo > findByUserName(String user);
}
