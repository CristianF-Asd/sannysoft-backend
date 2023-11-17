package com.example.demo.services;

import com.example.demo.intities.Mesa;
import com.example.demo.repository.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesaService implements IMesaService {

    @Autowired
    private MesaRepository repository;

    @Override
    public List<Mesa> getAll() {
        return (List<Mesa>) repository.findAll();
    }

    @Override
    public Mesa getById(Integer id) {
        return (Mesa) repository.findById(id).get();
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public void save(Mesa mesa) {
        repository.save(mesa);

    }
}
