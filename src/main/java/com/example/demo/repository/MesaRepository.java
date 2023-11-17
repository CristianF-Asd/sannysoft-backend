package com.example.demo.repository;

import com.example.demo.intities.Mesa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesaRepository extends CrudRepository<Mesa, Integer> {
}
