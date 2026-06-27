package com.vacavoa.ventos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vacavoa.ventos.model.Product;
import com.vacavoa.ventos.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    public List<Product> listProduct() {
        return productRepository.findAll();
    }

    public Optional<Product> findProductById(Long id){
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteProduct(Long id)
    {
        productRepository.deleteById(id);
    }
}
