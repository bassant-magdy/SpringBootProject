package com.springboot.Model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "Author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;

}
