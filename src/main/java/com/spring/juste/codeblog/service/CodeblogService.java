package com.spring.juste.codeblog.service;

import java.util.List;

import com.spring.juste.codeblog.model.Post;

public interface CodeblogService {
	
	List<Post> findAll();
	Post findById(long id);
	Post save(Post post);

}
