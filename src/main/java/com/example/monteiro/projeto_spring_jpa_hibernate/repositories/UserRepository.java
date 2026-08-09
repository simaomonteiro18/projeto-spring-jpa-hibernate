package com.example.monteiro.projeto_spring_jpa_hibernate.repositories;

import com.example.monteiro.projeto_spring_jpa_hibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    

}
