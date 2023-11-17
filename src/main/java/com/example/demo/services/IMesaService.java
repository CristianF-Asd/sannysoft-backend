package com.example.demo.services;

import com.example.demo.intities.Category;
import com.example.demo.intities.Mesa;

import java.util.List;

public interface IMesaService {

    List<Mesa> getAll();

    Mesa getById(Integer id);

    void remove(Integer id);

    void save(Mesa mesa);
}
