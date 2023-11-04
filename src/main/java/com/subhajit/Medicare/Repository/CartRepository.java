package com.subhajit.Medicare.Repository;

import com.subhajit.Medicare.Models.Cart;
import com.subhajit.Medicare.Models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CartRepository  extends MongoRepository<Cart, String> {
        Optional<Cart> findByUsername(String username);
        Boolean existsByUsername(String username);
}
