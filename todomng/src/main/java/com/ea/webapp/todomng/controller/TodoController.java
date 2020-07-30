package com.ea.webapp.todomng.controller;

import com.ea.webapp.todomng.model.Todo;
import com.ea.webapp.todomng.service.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @Autowired
    private ITodoService todoService;

    private String getLoggedinUsername(ModelMap model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            return ((UserDetails) principal).getUsername();
        }
        return principal.toString();
    }

    @GetMapping("/list-todo")
    public String showTodos(ModelMap model){
        String username = getLoggedinUsername(model);
        model.put("todos", todoService.getTodosByUser(username));
        return "list-todos";
    }

    @GetMapping("/add-todo")
    public String showAddTodo(ModelMap model){
        model.addAttribute("todo", new Todo());
        return "todo";
    }

}
