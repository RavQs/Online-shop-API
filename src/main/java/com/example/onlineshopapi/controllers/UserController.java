package com.example.onlineshopapi.controllers;


import com.example.onlineshopapi.models.dto.UserDto;
import com.example.onlineshopapi.service.abst.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
//TODO Добавить методы с работой над юзерами

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    public List<UserDto> getAllUsers() {
        return userService.findAll();
    }
}
