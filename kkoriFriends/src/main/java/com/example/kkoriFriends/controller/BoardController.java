package com.example.kkoriFriends.controller;


import com.example.kkoriFriends.service.BoardService;
import com.example.kkoriFriends.config.BaseResponse;
import com.example.kkoriFriends.entity.Article;
import com.example.kkoriFriends.model.ArticleBriefDTO;
import com.example.kkoriFriends.model.ArticleDTO;
import com.example.kkoriFriends.model.ArticleWriteDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/community")
public class BoardController {

    private final BoardService boardService;

    /*게시글 생성*/
    @PostMapping("/post")
    public ResponseEntity<?> createPost(@RequestBody ArticleWriteDTO articleWriteDTO)
    {
        ArticleWriteDTO dto = this.boardService.createPost(articleWriteDTO);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(BaseResponse.builder().result(dto).build());
    }

    /*추천 글 4개*/

    @GetMapping("/recommend")
    public ResponseEntity<?> showRecommendArticles()
    {
        PageRequest pageRequest = PageRequest.of(0, 4, Sort.by(Sort.Direction.DESC, "views"));

        List<ArticleDTO> articles = this.boardService.showTopArticles(pageRequest);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(BaseResponse.builder().result(articles).build());
    }


    @GetMapping("/food")
    public ResponseEntity<?> showAllFoodPost(@RequestParam(name = "pg") int pg)
    {
        PageRequest pageRequest = PageRequest.of(--pg, 10, Sort.by(Sort.Direction.DESC, "createdAt"));
        List<ArticleBriefDTO> foodArticles = this.boardService.showAllFoodPost(pageRequest);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(BaseResponse.builder().result(foodArticles).build());
     }

    @GetMapping("/food/article")
    public ResponseEntity<?> showFoodPostById(@RequestParam("id") Long id)
    {
        Article article = this.boardService.showArticleById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(BaseResponse.builder().result(article).build());
    }

    @GetMapping("/health")
    public ResponseEntity<?> showAllHealthPost(@RequestParam(name = "pg") int pg)
    {
        PageRequest pageRequest = PageRequest.of(--pg, 10, Sort.by(Sort.Direction.DESC, "createdAt"));
        List<ArticleBriefDTO> foodArticles = this.boardService.showAllHealthPost(pageRequest);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(BaseResponse.builder().result(foodArticles).build());
    }

    @GetMapping("/health/article")
    public ResponseEntity<?> showHealthPostById(@RequestParam("id") Long id)
    {
        Article article = this.boardService.showArticleById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(BaseResponse.builder().result(article).build());
    }


//    @GetMapping("/edu")
//    public ResponseEntity<?> showTrainers() {
//
//    }

}
