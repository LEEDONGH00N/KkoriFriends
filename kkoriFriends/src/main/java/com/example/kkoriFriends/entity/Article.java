package com.example.kkoriFriends.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="articles")
public class Article extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long articlesId;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private ArticleType articleType = ArticleType.health;

    @Column(name = "title")
    private String title;

    @Lob
    @Column(name = "content")
    private String content;

    @Builder.Default
    @Column(name = "views")
    private Long views = 0L;

    @Builder.Default
    @Column(name = "likes")
    private Long likes = 0L;



    public Article() {
    }

    @Builder
    public Article( String title, String content, Long views) {
        this.title = title;
        this.content = content;
        this.views = views;
    }



    public Article(String title, String content, ArticleType articleType) {
        this.title = title;
        this.content = content;
        this.articleType = articleType;
    }
}