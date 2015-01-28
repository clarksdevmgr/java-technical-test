package com.clarks.technicaltest.service.impl;

import com.clarks.technicaltest.domain.Product;
import com.clarks.technicaltest.repository.ProductRepository;
import com.clarks.technicaltest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultProductService implements ProductService {
    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Product getProduct(String productId) {
        return repository.findOne(productId);
    }
}
