package com.sofkau.software.relationaldb.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name="Comment")
@Table(name="COMMENT")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String message;

    private Long FK_post_id;


}
