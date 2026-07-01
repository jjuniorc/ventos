package com.vacavoa.ventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vacavoa.ventos.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
