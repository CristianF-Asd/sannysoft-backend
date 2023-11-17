package com.example.demo.repository;


import com.example.demo.intities.RolUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolUserRepository extends CrudRepository<RolUser, Integer> {
}
