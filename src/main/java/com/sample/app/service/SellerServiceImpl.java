package com.sample.app.service;

import com.sample.app.entity.Seller;
import com.sample.app.repository.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class SellerServiceImpl implements SellerService{
    private final SellerRepository sellerRepository;

    @Override
    public Seller getById(String id) {
        Optional<Seller> product = sellerRepository.findById(id);
        return product.orElse(null);
    }

    @Override
    public Seller createSeller(Seller seller) {
        return sellerRepository.save(seller);
    }

    @Override
    public List<Seller> findAll() {
        return sellerRepository.findAll();
    }
}
