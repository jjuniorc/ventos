package com.vacavoa.ventos.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "products")
@Data                 // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor    // Generates the mandatory default constructor
@AllArgsConstructor   // Generates the parameterized constructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
     @Column(nullable = false, length = 100)
    private String name;
    private String description;

     @Column(nullable = false)
    private Double price;
}
