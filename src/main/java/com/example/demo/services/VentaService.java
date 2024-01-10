package com.example.demo.services;

import com.example.demo.intities.Venta;
import com.example.demo.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VentaService implements IVentaService{

    @Autowired
    private VentaRepository repository;

    @Override
    public List<Venta> getAll() {
        return (List<Venta>) repository.findAll();
    }

    @Override
    public Venta getById(Integer id) {
        return (Venta) repository.findById(id).get();
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public void save(Venta venta) {
        repository.save(venta);

    }
}
