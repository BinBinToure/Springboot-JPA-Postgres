package com.example.firstproject.repositoty;

import com.example.firstproject.entity.Coffee;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CoffeeRepository extends CrudRepository<Coffee, Long> {

    @Override
    ArrayList<Coffee> findAll();
}
