package com.example.kkoriFriends.controller;

import com.example.kkoriFriends.entity.S3;
import com.example.kkoriFriends.service.S3Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/community")
public class S3Controller {
    private final S3Service s3Service;

    @PostMapping("/image")
    public S3 upload(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        return this.s3Service.upload(multipartFile,"upload");
    }


}
