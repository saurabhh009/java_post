package com.codewithme.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithme.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
