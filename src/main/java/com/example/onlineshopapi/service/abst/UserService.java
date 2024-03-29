package com.example.onlineshopapi.service.abst;

import com.example.onlineshopapi.exception.ValidationException;
import com.example.onlineshopapi.models.dto.UserDto;
import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto) throws ValidationException;
    void deleteUser(Integer userId);
    UserDto findByLogin(String login);
    UserDto findByName(String name);
    List<UserDto> findAll();
}
