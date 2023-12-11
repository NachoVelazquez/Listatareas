package com.CMEPPS.listatareas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.CMEPPS.listatareas.model.ListTodo;
import com.CMEPPS.listatareas.repository.ListTodoRepository;
import com.CMEPPS.listatareas.service.IListTodoService;

@Controller
public class ListTodoController implements IListTodoService {
	
    @Autowired
    private ListTodoRepository listtodoRepository;

    @Override
    public List < ListTodo > getListTodoByUser(String user) {
        return listtodoRepository.findByUserName(user);
    }

    @Override
    public Optional < ListTodo > getListTodoById(long id) {
        return listtodoRepository.findById(id);
    }

    @Override
    public void updateListTodo(ListTodo listtodo) {
        listtodoRepository.save(listtodo);
    }
    
    @Override
    public void addListTodo(int id, String nombre, List<String> todos, String descripcion) {
		listtodoRepository.save(new ListTodo(id,nombre,todos,descripcion));
    }
    @Override
    public void deleteListTodo(long id) {
        Optional < ListTodo > listtodo = listtodoRepository.findById(id);
        if (listtodo.isPresent()) {
            listtodoRepository.delete(listtodo.get());
        }
    }

    @Override
    public void saveListTodo(ListTodo listtodo) {
        listtodoRepository.save(listtodo);
    }

}
