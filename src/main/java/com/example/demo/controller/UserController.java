package com.example.demo.controller;



import com.example.demo.intities.User;
import com.example.demo.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService service;

    @GetMapping("/api/user")
    public List<User> getAll(){

        return service.getAll();
    }

    @GetMapping("/api/user/{id}")
    public User getById(@PathVariable String id){
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/user/{id}")
    public void remove(@PathVariable String id){
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/api/user/")
    public void save(@RequestBody User user){
        service.save(user);
    }
}
