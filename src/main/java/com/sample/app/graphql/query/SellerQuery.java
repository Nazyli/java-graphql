package com.sample.app.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sample.app.entity.Seller;
import com.sample.app.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SellerQuery implements GraphQLQueryResolver {
    private final SellerService sellerService;

    public List<Seller> sellers() {
        return sellerService.findAll();
    }

    public Seller seller(String id) {
        return sellerService.getById(id);
    }
}