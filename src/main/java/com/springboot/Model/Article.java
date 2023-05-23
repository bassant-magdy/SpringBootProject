package com.springboot.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@Table(name = "Article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "article-name")
    private String name;
    private String author;
    @Column(name = "auth-id")
    private Integer authorId;
    @OneToMany(mappedBy = "article")
    private List<Links> links;
}
