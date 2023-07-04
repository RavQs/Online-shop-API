package com.example.onlineshopapi.models.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostDto {
    private int id;
    private String title;
    private String desc;
}
