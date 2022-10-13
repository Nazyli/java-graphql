package com.sample.app.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.sample.app.entity.Product;
import com.sample.app.entity.Seller;
import com.sample.app.service.ProductService;
import com.sample.app.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductMutation implements GraphQLMutationResolver {
    private final ProductService productService;
    private final SellerService sellerService;

    public Product newProduct(Product product, String sellerId) {
        Seller seller = sellerService.getById(sellerId);
        product.setSeller(seller);
        return productService.create(product);
    }

    public Product updateProduct(Product product, String sellerId) {
        Seller seller = sellerService.getById(sellerId);
        product.setSeller(seller);
        return productService.update(product);
    }

    public Product removeProduct(String id) {
        return productService.remove(id);
    }
}
