package com.example.onlineshopapi.service.abst;

import com.example.onlineshopapi.models.entities.Role;

import java.util.List;

public interface RoleService {
    List<Role> findByRole(String role);
}
