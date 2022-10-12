package com.sample.app.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.sample.app.entity.Seller;
import com.sample.app.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SellerMutation implements GraphQLMutationResolver {
    private final SellerService sellerService;

    public Seller newSeller(Seller seller) {
        return sellerService.createSeller(seller);
    }
}
