package com.example.kkoriFriends.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/KkoriFriends")
    public String home() {
        return "index";
    }
}