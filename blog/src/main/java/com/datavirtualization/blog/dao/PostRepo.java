package com.datavirtualization.blog.dao;

import com.datavirtualization.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository <Post, Long>{

}
