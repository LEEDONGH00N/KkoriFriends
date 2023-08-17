package com.example.kkoriFriends.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/KkoriFriends/disease")
public class DiseaseController {
    @GetMapping("")
    public String showDisease() {
        return "개-증상별 질병찾기";
    }
    @GetMapping("/dog")
    public String showDogDisease() {
        return "개-증상별 질병찾기";
    }
    @GetMapping("/cat")
    public String showCatDisease() {
        return "고양이-증상별 질병찾기";
    }
    @GetMapping("/fish")
    public String showFishDisease() {
        return "물고기-증상별 질병찾기";
    }
    @GetMapping("/bird")
    public String showBirdDisease() {
        return "앵무새-증상별 질병찾기";
    }
}
