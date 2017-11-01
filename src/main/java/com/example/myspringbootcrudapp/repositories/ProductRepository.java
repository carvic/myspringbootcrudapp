package com.example.myspringbootcrudapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.myspringbootcrudapp.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
