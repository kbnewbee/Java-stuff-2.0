package com.ea.jpamysql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/user")
    public String userhome() {
        return "userhome";
    }

    @PostMapping("/user")
    public String postuserhome() {
        return "userhomepost";
    }

    @GetMapping("/admin")
    public String admin() {
        return "useradmin";
    }
}
