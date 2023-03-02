package com.example.onlineshopapi.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/first")
    public String mainPage() {
        return "/index";
    }

    @GetMapping("/second")
    public String secondPage() {
        return "/index2";
    }
}
