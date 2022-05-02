package com.sofkau.software.relationaldb.service;

import com.sofkau.software.relationaldb.entity.Comment;
import com.sofkau.software.relationaldb.entity.Post;

import java.util.List;


public interface PostService {

    Post createPost(Post post);

    Post createComment(Comment comment);

    void deleteComment(Comment comment);

    void deletePost(Post post);

    List<Post> findAllPost();



}
