package com.example.kkoriFriends.model.articleDTO;

import com.example.kkoriFriends.entity.ArticleType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class ArticleWriteDTO {

    private String title;
    private String content;
    private ArticleType articleType;


    public ArticleWriteDTO() {
    }


    @Builder
    public ArticleWriteDTO(String title, String content, ArticleType articleType) {
        this.title = title;
        this.content = content;
        this.articleType = articleType;
    }
}