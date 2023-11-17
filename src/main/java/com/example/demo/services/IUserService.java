package com.example.demo.services;


import com.example.demo.intities.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();

    User getById(Integer id);

    void remove(Integer id);

    void save(User user);
}
