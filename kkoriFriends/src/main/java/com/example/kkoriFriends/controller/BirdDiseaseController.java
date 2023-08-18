package com.example.kkoriFriends.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/KkoriFriends/disease/bird/")
public class BirdDiseaseController {
    @GetMapping("1")
    public String showBirdDisease1() {
        return "앵무새/앵무새-눈꺼풀이 두꺼워지고 분비물이 나온다";
    }

    @GetMapping("2")
    public String showBirdDisease2() {
        return "앵무새/앵무새-눈꼽이 끼고 눈꺼풀이 부풀어 오른다";
    }

    @GetMapping("3")
    public String showBirdDisease3() {
        return "앵무새/앵무새-붉은 반점이 난다";
    }

    @GetMapping("4")
    public String showBirdDisease4() {
        return "앵무새/앵무새-재채기를 많이 한다";
    }

    @GetMapping("5")
    public String showBirdDisease5() {
        return "앵무새/앵무새-목구멍 안쪽에 치즈같은 것이 뭉쳐있다";
    }

    @GetMapping("6")
    public String showBirdDisease6() {
        return "앵무새/앵무새-굳은 변을 보고 항문을 상하로 흔든다";
    }

    @GetMapping("7")
    public String showBirdDisease7() {
        return "앵무새/앵무새-몹시 가려워한다";
    }

    @GetMapping("8")
    public String showBirdDisease8() {
        return "앵무새/앵무새-밤에 분주하게 움직인다";
    }

    @GetMapping("9")
    public String showBirdDisease9() {
        return "앵무새/앵무새-어린 새가 괴로워한다";
    }

    @GetMapping("10")
    public String showBirdDisease10() {
        return "앵무새/앵무새-목구멍 안쪽에 치즈같은 것이 뭉쳐있다";
    }

    @GetMapping("11")
    public String showBirdDisease11() {
        return "앵무새/앵무새-어린 새가 먹는 것에 비해 성장이 더디다";
    }

    @GetMapping("12")
    public String showBirdDisease12() {
        return "앵무새/앵무새-가슴이 부풀고 모이를 못 먹는다";
    }

    @GetMapping("13")
    public String showBirdDisease13() {
        return "앵무새/앵무새-점액성 구토를 한다";
    }

    @GetMapping("14")
    public String showBirdDisease14() {
        return "앵무새/앵무새-깃털이 부풀고 갈증을 느낀다";
    }

    @GetMapping("15")
    public String showBirdDisease15() {
        return "앵무새/앵무새-설사 또는 녹색 변을 본다";
    }

}
