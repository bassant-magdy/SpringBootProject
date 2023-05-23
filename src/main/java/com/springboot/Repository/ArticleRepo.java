package com.springboot.Repository;

import com.springboot.Model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepo  extends JpaRepository<Article,Integer> {
    List<Article> findByName(String authorName);

}
