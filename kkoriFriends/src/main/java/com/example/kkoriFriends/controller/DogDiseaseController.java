package com.example.kkoriFriends.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/KkoriFriends/disease")
public class DogDiseaseController {

    @GetMapping("/dog/1")
    public String showDogDisease1()
    {
        return "개/개-눈꺼풀이 벌겋게 붓는다";
    }
    @GetMapping("/dog/2")
    public String showDogDisease2()
    {
        return "개/개-눈을 자주 찌푸린다";
    }
    @GetMapping("/dog/3")
    public String showDogDisease3()
    {
        return "개/개-눈물을 많이 흘린다";
    }
    @GetMapping("/dog/4")
    public String showDogDisease4()
    {
        return "개/개-눈이 충혈된다";
    }
    @GetMapping("/dog/5")
    public String showDogDisease5()
    {
        return "개/개-기지개를 자주 켠다";
    }
    @GetMapping("/dog/6")
    public String showDogDisease6()
    {
        return "개/개-엉덩이를 바닥에 쓸고 다닌다";
    }
    @GetMapping("/dog/7")
    public String showDogDisease7()
    {
        return "개/개-한 방향으로 빙빙 돈다";
    }
    @GetMapping("/dog/8")
    public String showDogDisease8()
    {
        return "개/개-다리를 절룩거리거나 한쪽 다리를 들고 다닌다";
    }
    @GetMapping("/dog/9")
    public String showDogDisease9()
    {
        return "개/개-걷는 모습이 이상하다";
    }
    @GetMapping("/dog/10")
    public String showDogDisease10()
    {
        return "개/개-숨을 헐떡인다";
    }
    @GetMapping("/dog/11")
    public String showDogDisease11()
    {
        return "개/개-숨소리가 달라진다";
    }
    @GetMapping("/dog/12")
    public String showDogDisease12()
    {
        return "개/개-호흡을 괴로워한다";
    }
    @GetMapping("/dog/13")
    public String showDogDisease13()
    {
        return "개/개-콧물을 많이 흘린다";
    }
    @GetMapping("/dog/14")
    public String showDogDisease14()
    {
        return "개/개-코피가 난다";
    }
    @GetMapping("/dog/15")
    public String showDogDisease15()
    {
        return "개/개-코를 곤다";
    }
    @GetMapping("/dog/16")
    public String showDogDisease16()
    {
        return "개/개-입안이나 코에서 출혈";
    }
    @GetMapping("/dog/17")
    public String showDogDisease17()
    {
        return "개/개-밥을 잘 먹지 않는다";
    }
    @GetMapping("/dog/18")
    public String showDogDisease18()
    {
        return "개/개-물을 많이 마신다";
    }

    @GetMapping("/dog/19")
    public String showDogDisease19()
    {
        return "개/개-배가 부풀어 오른다";
    }
    @GetMapping("/dog/20")
    public String showDogDisease20()
    {
        return "개/개-침을 많이 흘린다";
    }
    @GetMapping("/dog/21")
    public String showDogDisease21()
    {
        return "개/개-귀를 털거나 긁는다";
    }
    @GetMapping("/dog/22")
    public String showDogDisease22()
    {
        return "개/개-귀가 들리지 않는다";
    }
    @GetMapping("/dog/23")
    public String showDogDisease23()
    {
        return "개/개-귀를 가려워한다, 아파한다, 머리를 흔든다";
    }
    @GetMapping("/dog/24")
    public String showDogDisease24()
    {
        return "개/개-소변량이 줄어든다";
    }
    @GetMapping("/dog/25")
    public String showDogDisease25()
    {
        return "개/개-소변을 자주 지린다";
    }
    @GetMapping("/dog/26")
    public String showDogDisease26()
    {
        return "개/개-소변 색이 이상하다";
    }
    @GetMapping("/dog/27")
    public String showDogDisease27()
    {
        return "개/개-피부가 노랗다";
    }
    @GetMapping("/dog/28")
    public String showDogDisease28()
    {
        return "개/개-다치지 않았는데 보라색 멍이 들었다";
    }
    @GetMapping("/dog/29")
    public String showDogDisease29()
    {
        return "개/개-이상한 냄새가 난다";
    }



    @GetMapping("/dog/30")
    public String showDogDisease30()
    {
        return "개/개-멍울이 있다";
    }
    @GetMapping("/dog/31")
    public String showDogDisease31()
    {
        return "개/개-털이 빠진다";
    }
    @GetMapping("/dog/32")
    public String showDogDisease32()
    {
        return "개/개-고름이 나온다";
    }
    @GetMapping("/dog/33")
    public String showDogDisease33()
    {
        return "개/개-설사를 한다";
    }
    @GetMapping("/dog/34")
    public String showDogDisease34()
    {
        return "개/개-반복적으로 토한다";
    }
    @GetMapping("/dog/35")
    public String showDogDisease35()
    {
        return "개/개-변비를 보인다";
    }

    @GetMapping("/dog/36")
    public String showDogDisease36()
    {
        return "개/개-피를 토한다";
    }
    @GetMapping("/dog/37")
    public String showDogDisease37()
    {
        return "개/개-마른다";
    }

    @GetMapping("/dog/38")
    public String showDogDisease38()
    {
        return "개/개-체중 감소, 물을 많이 마시고 소변량이 증가하는 등의 증상을 동반한다";
    }
    @GetMapping("/dog/39")
    public String showDogDisease39()
    {
        return "개/개-침이 많다, 입안이나 잇몸이 붉고 출혈이 있다, 이가 흔들린다";
    }

    @GetMapping("/dog/40")
    public String showDogDisease40()
    {
        return "개/개-이빨이 갈색이나 검게 변색되었다";
    }
}
