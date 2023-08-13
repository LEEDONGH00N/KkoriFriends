package com.example.kkoriFriends.service;


import com.example.kkoriFriends.repository.ArticleRepository;
import com.example.kkoriFriends.entity.Article;
import com.example.kkoriFriends.entity.ArticleType;
import com.example.kkoriFriends.model.ArticleBriefDTO;
import com.example.kkoriFriends.model.ArticleDTO;
import com.example.kkoriFriends.model.ArticleWriteDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class BoardService {
    private final ArticleRepository articleRepository;

    private final ModelMapper modelMapper;

    public List<ArticleDTO> showTopArticles(Pageable pageable) {

        Page<Article> articles = this.articleRepository.findAll(pageable);

        return articles.getContent().stream()
                .map(article -> modelMapper.map(article, ArticleDTO.class))
                .collect(Collectors.toList());


    }

    public ArticleWriteDTO createPost(ArticleWriteDTO articleWriteDTO){

        Article article = new Article(articleWriteDTO.getTitle(),
                articleWriteDTO.getContent(),
                articleWriteDTO.getArticleType());

        log.info(articleWriteDTO.getArticleType().toString());

        Article article1 = this.articleRepository.save(article);

        return ArticleWriteDTO.builder()
                .content(article1.getContent())
                .title(article1.getTitle())
                .articleType(article1.getArticleType())
                .build();
    }

    public List<ArticleBriefDTO> showAllFoodPost(Pageable pageable)
    {
        Page<Article> articles = this.articleRepository.findAllByArticleType(ArticleType.food, pageable);
        return articles.getContent().stream()
                .map(article -> modelMapper.map(article, ArticleBriefDTO.class))
                .collect(Collectors.toList());
    }

    public List<ArticleBriefDTO> showAllHealthPost(Pageable pageable)
    {
        Page<Article> articles = this.articleRepository.findAllByArticleType(ArticleType.health, pageable);
        return articles.getContent().stream()
                .map(article -> modelMapper.map(article, ArticleBriefDTO.class))
                .collect(Collectors.toList());
    }

    public Article showArticleById(Long id)
    {
        return this.articleRepository.findArticleByArticlesId(id);
    }
}
