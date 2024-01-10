package com.example.demo.services;


import com.example.demo.intities.Venta;

import java.util.List;

public interface IVentaService {

    List<Venta> getAll();

    Venta getById(Integer id);

    void remove(Integer id);

    void save(Venta venta);
}
