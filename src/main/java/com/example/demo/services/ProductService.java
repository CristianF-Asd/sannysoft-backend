package com.example.demo.services;

import com.example.demo.intities.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService  {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> getAll(){
        return (List<Product>) repository.findAll();

    }

    @Override
    public Product getById(Integer id) {
        return (Product) repository.findById(id).get();
    }


    @Override
    public void remove(Integer id){
        repository.deleteById(id);
    }

    @Override
    public void save(Product product){
        repository.save(product);
    }
}
