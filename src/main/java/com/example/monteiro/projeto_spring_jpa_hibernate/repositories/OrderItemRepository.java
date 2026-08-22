package com.example.monteiro.projeto_spring_jpa_hibernate.repositories;

import com.example.monteiro.projeto_spring_jpa_hibernate.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    

}
