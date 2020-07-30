package com.ea.webapp.todomng.service;

import com.ea.webapp.todomng.model.Todo;
import com.ea.webapp.todomng.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService implements ITodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> getTodosByUser(String username) {
        return todoRepository.findByUsername(username);
    }

    @Override
    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void addTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(Long id) {
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
