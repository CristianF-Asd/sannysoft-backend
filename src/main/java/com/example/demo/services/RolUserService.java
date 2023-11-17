package com.example.demo.services;


import com.example.demo.intities.Product;
import com.example.demo.intities.RolUser;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.RolUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolUserService implements IRolUserService {


    @Autowired
    private RolUserRepository repository;

    @Override
    public List<RolUser> getAll(){
        return (List<RolUser>) repository.findAll();

    }

    @Override
    public RolUser getById(Integer id) {
        return (RolUser) repository.findById(id).get();
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public void save(RolUser rolUser) {
        repository.save(rolUser);

    }

}
