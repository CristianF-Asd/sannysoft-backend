package com.example.demo.services;

import com.example.demo.intities.Category;


import java.util.List;

public interface ICategoryService {

    List<Category> getAll();

    Category getById(Integer id);

    void remove(Integer id);

    void save(Category category);
}
