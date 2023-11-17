package com.example.demo.repository;

import com.example.demo.intities.Category;
import com.example.demo.intities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
