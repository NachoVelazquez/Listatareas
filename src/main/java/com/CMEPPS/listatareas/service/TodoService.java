package com.CMEPPS.listatareas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMEPPS.listatareas.model.Todo;
import com.CMEPPS.listatareas.repository.TodoRepository;

@Service
public class TodoService implements ITodoService {

	@Autowired
	private TodoRepository todoRepository;

	@Override
	public List<Todo> getTodosByUser(String user) {
		return todoRepository.findByUserName(user);
	}

	@Override
	public List<Todo> getTodosByUserOrderbyPriority(String user) {
		return todoRepository.findByUserNameOrderByPriority(user);
	}

	@Override
	public List<Todo> getTodosByUserOrderbyDuration(String user) {
		return todoRepository.findByUserNameOrderByDuration(user);
	}

	@Override
	public List<Todo> getTodosByUserNameAndDurationLessThan(String user, int duration) {
		return todoRepository.findByUserNameAndDurationLessThan(user, duration);
	}

	@Override
	public Optional<Todo> getTodoById(long id) {
		return todoRepository.findById(id);
	}

	@Override
	public void updateTodo(Todo todo) {
		todoRepository.save(todo);
	}

	@Override
	public void addTodo(long id, String UserName, String Name, String description, int duration, int priority,
			int idlist) {
		todoRepository.save(new Todo(id, UserName, Name, description, duration, priority, idlist));
	}

	@Override
	public void deleteTodo(long id) {
		Optional<Todo> todo = todoRepository.findById(id);
		if (todo.isPresent()) {
			todoRepository.delete(todo.get());
		}
	}

	@Override
	public void saveTodo(Todo todo) {
		todoRepository.save(todo);
	}
}