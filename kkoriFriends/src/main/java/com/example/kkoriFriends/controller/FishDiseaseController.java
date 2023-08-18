package com.example.kkoriFriends.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/KkoriFriends/disease/fish/")
public class FishDiseaseController {

    @GetMapping("1")
    public String showFishDisease1() {
        return "물고기/물고기-몸이 부풀어 오르며 비늘이 일어난다";
    }

    @GetMapping("2")
    public String showFishDisease2() {
        return "물고기/물고기-배가 붓고 붉은 반점이 생긴다";
    }



    @GetMapping("3")
    public String showFishDisease4() {
        return "물고기/물고기-몸과 지느러미 표면에 작은 하얀 점이 생긴다";
    }

    @GetMapping("4")
    public String showFishDisease5() {
        return "물고기/물고기-몸이 부풀어 오르며 비늘이 일어난다";
    }

    @GetMapping("5")
    public String showFishDisease6() {
        return "물고기/물고기-몸에 흰 점이 늘어난다";
    }

    @GetMapping("6")
    public String showFishDisease7() {
        return "물고기/물고기-입 주위가 투명하게 변한다";
    }

    @GetMapping("7")
    public String showFishDisease8() {
        return "물고기/물고기-환부가 하얗게 보인다";
    }

    @GetMapping("8")
    public String showFishDisease9() {
        return "물고기/물고기-서서히 쇠약해진다";
    }

    @GetMapping("9")
    public String showFishDisease10() {
        return "물고기/물고기-몸이 부풀어 오르며 비늘이 일어난다";
    }

    @GetMapping("10")
    public String showFishDisease3() {
        return "물고기/물고기-흰색의 실이 몸에 생겼다";
    }

}
