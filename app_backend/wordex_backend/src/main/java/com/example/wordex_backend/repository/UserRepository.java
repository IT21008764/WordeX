package com.example.wordex_backend.repository;

import com.example.wordex_backend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email); // Custom method
}