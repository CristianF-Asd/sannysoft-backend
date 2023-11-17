package com.example.demo.services;


import com.example.demo.intities.RolUser;

import java.util.List;

public interface IRolUserService {

    List<RolUser> getAll();

    RolUser getById(Integer id);

    void remove(Integer id);

    void save(RolUser rolUser);
}
