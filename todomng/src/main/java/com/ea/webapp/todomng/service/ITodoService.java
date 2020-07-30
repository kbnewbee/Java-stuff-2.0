package com.ea.webapp.todomng.service;

import com.ea.webapp.todomng.model.Todo;

import java.util.List;
import java.util.Optional;

public interface ITodoService {
    List<Todo> getTodosByUser(String username);

    Optional<Todo> getTodoById(Long id);

    void updateTodo(Todo todo);

    void deleteTodo(Long id);

    void saveTodo(Todo todo);

    void addTodo(Todo todo);
}
