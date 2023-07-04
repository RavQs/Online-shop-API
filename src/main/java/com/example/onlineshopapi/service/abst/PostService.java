package com.example.onlineshopapi.service.abst;

import com.example.onlineshopapi.exception.ValidationException;
import com.example.onlineshopapi.models.dto.PostDto;
import java.util.List;

public interface PostService {
    PostDto savePost(PostDto post) throws ValidationException;
    void deletePost(Integer postId);
    PostDto findByTitle(String title);
    PostDto findByDesc(String desc);
    List<PostDto> findAll();
}

