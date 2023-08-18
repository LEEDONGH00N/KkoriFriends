package com.example.kkoriFriends.controller;


import com.example.kkoriFriends.service.CommunityService;
import com.example.kkoriFriends.config.BaseResponse;
import com.example.kkoriFriends.entity.Article;
import com.example.kkoriFriends.model.articleDTO.ArticleBriefDTO;
import com.example.kkoriFriends.model.articleDTO.ArticleDTO;
import com.example.kkoriFriends.model.articleDTO.ArticleWriteDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/KkoriFriends/community")
public class CommunityController {

    private final CommunityService boardService;

    @GetMapping("")
    public String showCommunity() {
        return "커뮤니티";
    }

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
        PageRequest pageRequest = PageRequest.of(0, 8, Sort.by(Sort.Direction.DESC, "views"));

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

    @GetMapping("/food/article/{id}")
    public ResponseEntity<?> showFoodPostById(@PathVariable Long id)
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


    @GetMapping("/health/article/{id}")
    public ResponseEntity<?> showHealthPostById(@PathVariable Long id)
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
