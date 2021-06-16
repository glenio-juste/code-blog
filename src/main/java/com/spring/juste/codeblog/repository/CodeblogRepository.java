package com.spring.juste.codeblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.juste.codeblog.model.Post;

public interface CodeblogRepository extends JpaRepository<Post, Long> {

}
