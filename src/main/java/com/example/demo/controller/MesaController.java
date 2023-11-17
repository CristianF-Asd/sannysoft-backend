package com.example.demo.controller;


import com.example.demo.intities.Mesa;
import com.example.demo.services.IMesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MesaController {

    @Autowired
    private IMesaService service;


    @GetMapping("/api/mesa")
    public List<Mesa> getAll(){
        return  service.getAll();
    }

    @GetMapping("/api/mesa/{id}")
    public Mesa getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/mesa/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/api/mesa/")
    public void save(@RequestBody Mesa mesa){
        service.save(mesa);
    }
}
