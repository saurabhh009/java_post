package com.codewithme.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithme.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
