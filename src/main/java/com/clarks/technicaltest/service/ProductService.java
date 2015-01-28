package com.clarks.technicaltest.service;

import com.clarks.technicaltest.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProduct(String productId);
}
