package com.example.onlineshopapi.repository;

import com.example.onlineshopapi.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByLogin(String login);
}
