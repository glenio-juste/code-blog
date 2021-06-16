package com.spring.juste.codeblog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.juste.codeblog.model.Post;
import com.spring.juste.codeblog.repository.CodeblogRepository;
import com.spring.juste.codeblog.service.CodeblogService;

@Service
public class CodeblogServiceImpl implements CodeblogService {
	
	@Autowired
	CodeblogRepository codeblogRepository;

	@Override
	public List<Post> findAll() {
		return codeblogRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		return codeblogRepository.findById(id).get(); 
	}

	@Override
	public Post save(Post post) {
		return codeblogRepository.save(post);
	}

	
	
}
