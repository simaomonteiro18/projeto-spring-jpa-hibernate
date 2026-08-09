package com.example.monteiro.projeto_spring_jpa_hibernate.resources;

import com.example.monteiro.projeto_spring_jpa_hibernate.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {

        User u = new User(1L, "Simão", "sasmonteiro07@gmail.com", "926016064", "1904");
        return ResponseEntity.ok().body(u);

    }

}
