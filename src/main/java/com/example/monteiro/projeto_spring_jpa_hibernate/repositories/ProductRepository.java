package com.example.monteiro.projeto_spring_jpa_hibernate.repositories;

import com.example.monteiro.projeto_spring_jpa_hibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    

}
