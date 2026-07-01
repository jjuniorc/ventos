package com.vacavoa.ventos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vacavoa.ventos.exceptions.ResourceNotFoundException;
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

    public Product findProductById(Long id){
        return productRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Product with ID " + id + " not found."));
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteProduct(Long id)
    {
        if(productRepository.existsById(id) == false)
        {
            throw new ResourceNotFoundException("Product with ID " + id + " not found.");
        }

        productRepository.deleteById(id);
    }
}
