package com.sofkau.software.relationaldb.repository;

import com.sofkau.software.relationaldb.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
