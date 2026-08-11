package com.example.monteiro.projeto_spring_jpa_hibernate.repositories;

import com.example.monteiro.projeto_spring_jpa_hibernate.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    

}
