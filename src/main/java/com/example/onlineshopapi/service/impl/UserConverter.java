package com.example.onlineshopapi.service.impl;

import com.example.onlineshopapi.models.dto.UserDto;
import com.example.onlineshopapi.models.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public User fromUserDtoToUser(UserDto usersDto) {
        User user = new User();
        user.setId(usersDto.getId());
        user.setEmail(usersDto.getEmail());
        user.setName(usersDto.getName());
        user.setLogin(usersDto.getLogin());
        return user;
    }

    public UserDto fromUserToUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .login(user.getLogin())
                .name(user.getName())
                .build();
    }
}
