package com.example.onlineshopapi.controllers;


import com.example.onlineshopapi.exception.ValidationException;
import com.example.onlineshopapi.models.dto.UserDto;
import com.example.onlineshopapi.service.abst.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081/")
@RequestMapping("/api/users")
@Log
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/findAll")
    public List<UserDto> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/findByLogin")
    public UserDto getUserByLogin(@RequestParam  String login) {
        return userService.findByLogin(login);
    }

    @PostMapping("/save")
    public UserDto saveUser(@RequestBody UserDto userDto) throws ValidationException {
        log.info("Handling save user: " + userDto);

        return userService.saveUser(userDto);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUsers(@PathVariable Integer id) {
        log.info("Handling delete user request: " + id);
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }
}
