package com.example.kkoriFriends.controller;


import com.example.kkoriFriends.config.BaseResponse;
import com.example.kkoriFriends.model.AbandonedDTO;
import com.example.kkoriFriends.service.ApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/abandoned")
public class ApiParseController {

    private final ApiService apiService;

    //첫화면 -> 전체 데이터 띄우기 (페이징)
    //
    @GetMapping("")
    public ResponseEntity<?> getApi(@RequestParam(name = "pIndex") String index,
                                    @RequestParam(name = "pSize") String size) throws IOException {

        String baseUrl = "https://openapi.gg.go.kr";
        String service = "AbdmAnimalProtect";
        String apiKey = "5371c22525364e3692b8f1be32981c2c";
        String fileType = "json";
        String apiUrl = String.format("%s/%s?KEY=%s&TYPE=%s&pIndex=%s&pSize=%s",
                baseUrl, service, apiKey, fileType, index, size);

        List<AbandonedDTO> abandonedList = this.apiService.getApi(apiUrl);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(BaseResponse.builder().result(abandonedList).build());
    }


}
