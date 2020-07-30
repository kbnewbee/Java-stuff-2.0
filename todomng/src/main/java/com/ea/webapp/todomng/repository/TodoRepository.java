package com.ea.webapp.todomng.repository;

import com.ea.webapp.todomng.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByUsername(String username);
}
