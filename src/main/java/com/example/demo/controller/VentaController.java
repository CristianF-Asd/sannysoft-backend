package com.example.demo.controller;

import com.example.demo.intities.Venta;
import com.example.demo.services.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VentaController {

    @Autowired
    private IVentaService service;

    @GetMapping("/api/ventas")
    public List<Venta> getAll(){
        return service.getAll();
    }

    @GetMapping("/api/ventas/{id}")
    public Venta getById(@PathVariable String id){
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/ventas/{id}")
    public void remove(@PathVariable String id){
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/api/ventas/")
    public void save(@RequestBody Venta ventas){
        service.save(ventas);
    }


}
