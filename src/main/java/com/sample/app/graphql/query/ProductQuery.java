package com.sample.app.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sample.app.entity.Product;
import com.sample.app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductQuery implements GraphQLQueryResolver {
    private final ProductService productService;

    public List<Product> products() {
        return productService.getAll();
    }

    public Product product(String id) {
        return productService.getById(id);
    }
}