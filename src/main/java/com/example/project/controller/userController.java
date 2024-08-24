package com.example.project.controller;

import com.example.project.entity.User;
import com.example.project.service.registerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userController {

    private final registerService registerservice;

    public userController(registerService registerservice)
    {
        this.registerservice=registerservice;
    }

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user)
    {
        User savedUser = registerservice.saveUser(user);

        return ResponseEntity.ok(savedUser);
    }
}
