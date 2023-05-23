package com.springboot.Service;


import com.springboot.Model.Author;

public interface AuthorService {
    Author getAuthorById(Integer id);
    Author addArticle(Author article);

}
