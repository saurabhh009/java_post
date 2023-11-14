package com.codewithme.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithme.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
