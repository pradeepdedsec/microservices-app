package com.test.product_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.product_service.model.Product;

@Service
public interface ProductService {
    Product createProduct(Product product);

    Product getProduct(String id);

    List<Product> getProducts();
}
