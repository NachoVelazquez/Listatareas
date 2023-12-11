package com.CMEPPS.listatareas.service;

import java.util.List;
import java.util.Optional;
import com.CMEPPS.listatareas.model.ListTodo;

public interface IListTodoService {

	List<ListTodo> getListTodoByUser(String user);

    Optional < ListTodo > getListTodoById(long id);

    void updateListTodo(ListTodo listtodo);

    void addListTodo(int id, String nombre, List<String> todos, String descripcion);

    void deleteListTodo(long id);

    void saveListTodo(ListTodo listtodo);


}
