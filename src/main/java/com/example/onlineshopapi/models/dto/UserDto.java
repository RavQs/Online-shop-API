package com.example.onlineshopapi.models.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
    private int id;
    private String name;
    private String login;
    private String email;
}
