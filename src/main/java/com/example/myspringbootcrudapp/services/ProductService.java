package com.example.myspringbootcrudapp.services;

import com.example.myspringbootcrudapp.entities.Product;

public interface ProductService {

    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);

}
