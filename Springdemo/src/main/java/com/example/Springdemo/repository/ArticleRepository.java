package com.example.Springdemo.repository;

import com.example.Springdemo.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository <Article,Long> {
}
