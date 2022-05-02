package com.sofkau.software.relationaldb.controller;

import com.sofkau.software.relationaldb.entity.Comment;
import com.sofkau.software.relationaldb.entity.Post;
import com.sofkau.software.relationaldb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/")
public class Controller {

    @Autowired
    private PostService service;

    @GetMapping
    public List<Post> getAllPost(){
        return service.findAllPost();
    }

    @PostMapping("create/post")
    public Post createPost(@RequestBody Post post){
        return service.createPost(post);
    }

    @PostMapping("create/comment")
    public Post createComment(@RequestBody Comment comment){
        return service.createComment(comment);
    }

    @DeleteMapping("delete/post")
    public void deletePost(@RequestBody Post post){
        service.deletePost(post);
    }

    @DeleteMapping("delete/comment")
    public void deleteComment(@RequestBody Comment comment){
        service.deleteComment(comment);
    }

}
