package com.example.Springdemo.dto;

import com.example.Springdemo.entity.Article;

public class ArticleForm {
    private String title;
    private String content;

    public ArticleForm(String title, String content){
        this.title = title;
        this.content = content;

    }

    @Override
    public String toString() {
        return "Articleform{" + "title ='" + title + '\'' + ", content='" +content + '\'' + '}';
    }

    public Article toEntity() {
        return new Article(null, title, content);
    }


}
