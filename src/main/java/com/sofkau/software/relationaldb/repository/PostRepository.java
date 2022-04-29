package com.sofkau.software.relationaldb.repository;

import com.sofkau.software.relationaldb.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
