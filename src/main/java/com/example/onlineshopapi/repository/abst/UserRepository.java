package com.example.onlineshopapi.repository.abst;

import com.example.onlineshopapi.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByLogin(String login);
    User findByName(String name);
}
