package com.example.project.controller;

import com.example.project.entity.User;
import com.example.project.service.registerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
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
