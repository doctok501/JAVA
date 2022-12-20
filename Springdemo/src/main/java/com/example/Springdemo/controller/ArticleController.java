package com.example.Springdemo.controller;

import com.example.Springdemo.dto.ArticleForm;
import com.example.Springdemo.entity.Article;
import com.example.Springdemo.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @GetMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());

        Article article = form.toEntity();
        System.out.println(article.toString());

        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());

        return "";
    }
}
