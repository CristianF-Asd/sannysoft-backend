package com.example.demo.services;

import com.example.demo.intities.Category;

import com.example.demo.intities.Product;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements  ICategoryService{


    @Autowired
    private CategoryRepository repository;

    @Override
    public List<Category> getAll() {
        return (List<Category>) repository.findAll();
    }

    @Override
    public Category getById(Integer id) {
        return (Category) repository.findById(id).get();
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Category category) {
        repository.save(category);
    }
}
