package com.sample.app.service;

import com.sample.app.entity.Seller;

import java.util.List;

public interface SellerService {
    Seller getById(String id);
    Seller createSeller(Seller seller);
    List<Seller> findAll();
}
