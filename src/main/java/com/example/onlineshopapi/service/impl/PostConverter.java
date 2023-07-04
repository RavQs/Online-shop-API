package com.example.onlineshopapi.service.impl;

import com.example.onlineshopapi.models.dto.PostDto;
import com.example.onlineshopapi.models.entities.Post;
import org.springframework.stereotype.Component;

@Component
public class PostConverter {
    public Post fromPostDtoToPost(PostDto postDto) {
        Post post = new Post();
        post.setId(postDto.getId());
        post.setTitle(postDto.getTitle());
        post.setDesc(postDto.getDesc());
        return post;
    }

    public PostDto fromPostToPostDto(Post post) {
        return PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .desc(post.getDesc())
                .build();
    }
}
