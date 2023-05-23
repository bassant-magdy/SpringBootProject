package com.springboot.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Links {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer linkId;
    private String rel;
    private String href;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Article article;
}
