package com.vacavoa.ventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vacavoa.ventos.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
