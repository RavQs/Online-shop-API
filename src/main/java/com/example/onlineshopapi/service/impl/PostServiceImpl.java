package com.example.onlineshopapi.service.impl;

import com.example.onlineshopapi.exception.ValidationException;
import com.example.onlineshopapi.models.dto.PostDto;
import com.example.onlineshopapi.models.entities.Post;
import com.example.onlineshopapi.repository.abst.PostRepository;
import com.example.onlineshopapi.service.abst.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@AllArgsConstructor
@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;
    private PostConverter postConverter;

    @Override
    public PostDto savePost(PostDto postDto) throws ValidationException {

        validatePostDto(postDto);
        Post savePost = postRepository.save(postConverter.fromPostDtoToPost(postDto));

        return postConverter.fromPostToPostDto(savePost);
    }

    @Override
    public void deletePost(Integer postId) {
        postRepository.deleteById(postId);
    }

    @Override
    public PostDto findByTitle(String title) {
        Post post = postRepository.findByTitle(title);
        if (!isNull(post)) {
            return postConverter.fromPostToPostDto(post);
        }
        return null;
    }

    @Override
    public PostDto findByDesc(String desc) {
        Post post = postRepository.findByDesc(desc);
        if (!isNull(post)) {
            return postConverter.fromPostToPostDto(post);
        }
        return null;
    }

    @Override
    public List<PostDto> findAll() {
        return postRepository.findAll()
                .stream()
                .map(postConverter::fromPostToPostDto)
                .collect(Collectors.toList());
    }



    private void validatePostDto(PostDto postDto) throws ValidationException {
        if (isNull(postDto)) {
            throw new ValidationException("Object user is null");
        }
        if (isNull(postDto.getTitle()) || postDto.getDesc().isEmpty()) {
            throw new ValidationException("title/desc is empty");
        }
    }
}
