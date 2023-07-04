package com.example.onlineshopapi.repository.abst;

import com.example.onlineshopapi.models.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
    Post findByTitle(String title);
    Post findByDesc(String desc);
}

