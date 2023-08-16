package com.example.kkoriFriends.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class S3 {
    private String key;
    private String path;

    public S3() {

    }

    @Builder
    public S3(String key, String path) {
        this.key = key;
        this.path = path;
    }
}