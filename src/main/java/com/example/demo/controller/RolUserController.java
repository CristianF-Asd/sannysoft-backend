package com.example.demo.controller;





import com.example.demo.intities.RolUser;
import com.example.demo.services.IRolUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RolUserController {

    @Autowired
    private IRolUserService service;

    @GetMapping("/api/rol-user")
    public List<RolUser> getAll(){

        return service.getAll();
    }

    @GetMapping("/api/rol-user/{id}")
    public RolUser getById(@PathVariable String id){

        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/rol-user/{id}")
    public void remove(@PathVariable String id){
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/api/rol-user/")
    public void save(@RequestBody RolUser rolUser){
        service.save(rolUser);
    }







}
