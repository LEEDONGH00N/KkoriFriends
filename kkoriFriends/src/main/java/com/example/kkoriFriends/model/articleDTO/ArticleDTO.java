package com.example.kkoriFriends.model.articleDTO;


import com.example.kkoriFriends.entity.ArticleType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ArticleDTO {
    private String title;
    private String content;
    private ArticleType articleType;
    private Long views;
    private Long likes;
    private LocalDateTime createdAt;
}