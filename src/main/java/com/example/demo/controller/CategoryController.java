package com.example.demo.controller;

import com.example.demo.intities.Category;
import com.example.demo.intities.Product;
import com.example.demo.services.ICategoryService;
import com.example.demo.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CategoryController {

    @Autowired
    private ICategoryService service;

    @GetMapping("/api/category")
    public List<Category> getAll(){

        return service.getAll();
    }

    @GetMapping("/api/category/{id}")
    public Category getById(@PathVariable String id){
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/category/{id}")
    public void remove(@PathVariable String id){
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/api/category/")
    public void save(@RequestBody Category category){
        service.save(category);
    }
}
