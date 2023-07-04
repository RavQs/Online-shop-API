package com.example.onlineshopapi.controllers;


import com.example.onlineshopapi.exception.ValidationException;
import com.example.onlineshopapi.models.dto.PostDto;
import com.example.onlineshopapi.service.abst.PostService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081/")
@RequestMapping("/api/posts")
@Log
@AllArgsConstructor
public class PostController {


    //TODO Создать пагинацию постов
    private final PostService postService;

    @GetMapping("/findAll")
    public List<PostDto> getAllPosts() {
        return postService.findAll();
    }

    @GetMapping("/findByTitle")
    public PostDto getPostByTitle(@RequestParam String title) {
        return postService.findByTitle(title);
    }

    @GetMapping("/findByDesc")
    public PostDto getPostByDesc(@RequestParam String desc) {
        return postService.findByDesc(desc);
    }

    @PostMapping("/save")
    public PostDto savePost(@RequestBody PostDto postDto) throws ValidationException {
        log.info("Handling save post: " + postDto);

        return postService.savePost(postDto);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Integer id) {
        log.info("Handling delete post request: " + id);
        postService.deletePost(id);
        return ResponseEntity.ok().build();

    }
}
