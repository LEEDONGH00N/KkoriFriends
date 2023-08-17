package com.example.kkoriFriends.controller;

import com.example.kkoriFriends.config.BaseResponse;
import com.example.kkoriFriends.model.abandonedDTO.AbandonedDTO;
import com.example.kkoriFriends.service.ApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/KkoriFriends/abandoned")
public class AbandonedController {

    private final ApiService apiService;


    //첫화면 -> 전체 데이터 띄우기 (페이징)
    @GetMapping("/{index}")
    public String getApi(@PathVariable String index, Model model) throws IOException {

        String baseUrl = "https://openapi.gg.go.kr";
        String service = "AbdmAnimalProtect";
        String apiKey = "5371c22525364e3692b8f1be32981c2c"; //localhost용
        //69d997be66bd4e3cbe4cf0658a4d9b76 : url용
        String fileType = "json";
        String apiUrl = String.format("%s/%s?KEY=%s&TYPE=%s&pIndex=%s&pSize=%s",
                baseUrl, service, apiKey, fileType, index, 9);

        List<AbandonedDTO> abandonedDTOS = this.apiService.getApi(apiUrl);

        model.addAttribute("abandonedList", abandonedDTOS);
        model.addAttribute("currentPage", index); // 현재 페이지 정보도 모델에 추가

        return "유기동물_찾기"; // 페이지 템플릿 이름 반환

    }
}
