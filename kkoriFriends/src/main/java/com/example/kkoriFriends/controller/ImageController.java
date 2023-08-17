package com.example.kkoriFriends.controller;

import com.example.kkoriFriends.config.BaseResponse;
import com.example.kkoriFriends.entity.S3;
import com.example.kkoriFriends.model.imageDTO.ImageDTO;
import com.example.kkoriFriends.service.ImageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/KkoriFriends/community")
public class ImageController {
    private final ImageService s3Service;
    @GetMapping("/post/image")
    public String showUploadPage() {
        return "upload.html";
    }
    @PostMapping("/post/image")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        S3 s3 = this.s3Service.upload(multipartFile,"upload");

        ImageDTO imageDTO = new ImageDTO(s3.getPath());

        log.info(imageDTO.getUrl());

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(BaseResponse.builder().result(imageDTO).build());
    }

}
