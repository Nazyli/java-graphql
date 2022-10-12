package com.sample.app.service;

import com.sample.app.entity.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    Product getById(String id);
    List<Product> getAll();
    Product create(Product product);
    Product update(Product product);
    Product remove(String id);
}
