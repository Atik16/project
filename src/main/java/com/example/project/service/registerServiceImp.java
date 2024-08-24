package com.example.project.service;

import com.example.project.entity.User;
import com.example.project.repository.registerRepository;
import org.springframework.stereotype.Service;

@Service
public class registerServiceImp implements registerService {

    private final registerRepository repository;

    public  registerServiceImp(registerRepository repository)
    {
        this.repository=repository;
    }
    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }
}
