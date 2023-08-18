package com.example.kkoriFriends.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/KkoriFriends/disease/cat")
public class CatDiseaseController {

    @GetMapping("/1")
    public String showCatDisease1() {
        return "고양이/고양이-눈꼽이 낀다";
    }

    @GetMapping("/2")
    public String showCatDisease2() {
        return "고양이/고양이-눈꺼풀 연축 현상";
    }
    @GetMapping("/3")
    public String showCatDisease3() {
        return "고양이/고양이-눈이 점점 커진다";
    }
    @GetMapping("/4")
    public String showCatDisease4() {
        return "고양이/고양이-재채기";
    }
    @GetMapping("/5")
    public String showCatDisease5() {
        return "고양이/고양이-경련, 발작";
    }

    @GetMapping("/6")
    public String showCatDisease6() {
        return "고양이/고양이-화장실 행동";
    }
    @GetMapping("/7")
    public String showCatDisease7() {
        return "고양이/고양이-움직이지 않는다";
    }
    @GetMapping("/8")
    public String showCatDisease8() {
        return "고양이/고양이-호흡곤란";
    }
    @GetMapping("/9")
    public String showCatDisease9() {
        return "고양이/고양이-구토";
    }
    @GetMapping("/10")
    public String showCatDisease10() {
        return "고양이/고양이-설사";
    }

    @GetMapping("/11")
    public String showCatDisease11() {
        return "고양이/고양이-복부팽만";
    }
    @GetMapping("/12")
    public String showCatDisease12() {
        return "고양이/고양이-식욕부진";
    }
    @GetMapping("/13")
    public String showCatDisease13() {
        return "고양이/고양이-물을 많이 마신다";
    }
    @GetMapping("/14")
    public String showCatDisease14() {
        return "고양이/고양이-왕성한 식욕";
    }
    @GetMapping("/15")
    public String showCatDisease15() {
        return "고양이/고양이-야윈다";
    }
    @GetMapping("/16")
    public String showCatDisease16() {
        return "고양이/고양이-걸음걸이 이상";
    }
    @GetMapping("/17")
    public String showCatDisease17() {
        return "고양이/고양이-몸의 응어리";
    }
    @GetMapping("/18")
    public String showCatDisease18() {
        return "고양이/고양이-귀를 자주 긁는다";
    }
    @GetMapping("/19")
    public String showCatDisease19() {
        return "고양이/고양이-상처가 낫지 않는다";
    }
    @GetMapping("/20")
    public String showCatDisease20() {
        return "고양이/고양이-몸을 긁는다";
    }
    @GetMapping("/21")
    public String showCatDisease21() {
        return "고양이/고양이-격심한 발정";
    }

}
