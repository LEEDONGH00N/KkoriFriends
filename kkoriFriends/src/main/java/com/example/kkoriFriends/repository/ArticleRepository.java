package com.example.kkoriFriends.repository;

import com.example.kkoriFriends.entity.Article;
import com.example.kkoriFriends.entity.ArticleType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {


    Page<Article> findAll(Pageable pageable);
    Page<Article> findAllByArticleType(ArticleType articleType, Pageable pageable);

    Article findArticleByArticlesId(Long id);
}
