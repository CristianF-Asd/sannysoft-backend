package com.example.demo.services;

import com.example.demo.intities.Product;

import java.util.List;

public interface IProductService {

     List<Product> getAll();

    Product getById(Integer id);

    void remove(Integer id);

    void save(Product product);


}
