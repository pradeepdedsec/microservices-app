package com.test.product_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.product_service.model.Product;

public interface ProductRepository extends MongoRepository<Product,String> {
    
}
