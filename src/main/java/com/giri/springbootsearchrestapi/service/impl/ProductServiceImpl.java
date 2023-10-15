package com.giri.springbootsearchrestapi.service.impl;

import com.giri.springbootsearchrestapi.entity.Product;
import com.giri.springbootsearchrestapi.repository.ProductRepository;
import com.giri.springbootsearchrestapi.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = productRepository.searchProducts(query);

        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
