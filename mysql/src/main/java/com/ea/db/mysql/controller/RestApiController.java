package com.ea.db.mysql.controller;

import com.ea.db.mysql.dao.TCRepository;
import com.ea.db.mysql.model.MyUserTC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestApiController {

    private TCRepository tcRepository;

    public RestApiController() {
    }

    @GetMapping("/users")
    public List<MyUserTC> users() {
        return tcRepository.findAll();
    }

}
