package com.example.kkoriFriends.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ArticleBriefDTO {
    private String title;
    private LocalDateTime createdAt;
    private Long views;
    private Long likes;
    private Long articleId;
}
