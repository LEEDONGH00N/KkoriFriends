package com.example.kkoriFriends.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/KkoriFriends/hospital")
public class HospitalController {
    @GetMapping("")
    public String hello() {
        return "병원_찾기";
    }

}
