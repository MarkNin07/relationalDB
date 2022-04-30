package com.sofkau.software.relationaldb.service;

import com.sofkau.software.relationaldb.entity.Comment;
import com.sofkau.software.relationaldb.entity.Post;
import com.sofkau.software.relationaldb.repository.CommentRepository;
import com.sofkau.software.relationaldb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;


public class postServ implements postService{

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Post createPost(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public Post createComment(Comment comment) {
        Post post = postRepository.findById(comment.getFK_post_id()).get();
        post.addComment(comment);
        commentRepository.save(comment);
        return postRepository.save(post);
    }

    @Override
    public void deleteComment(Comment comment) {
        commentRepository.deleteById(comment.getId());
    }

    @Override
    public void deletePost(Post post) {
        Post postToBeDeleted = postRepository.findById(post.getId()).get();
        if(postToBeDeleted.getComments().size() >= 0){
            postToBeDeleted.getComments().forEach(comment -> commentRepository.deleteById(comment.getId()));
        }
        postRepository.deleteById(post.getId());
    }

    @Override
    public List<Post> findAllPost() {
        return postRepository.findAll();
    }
}
