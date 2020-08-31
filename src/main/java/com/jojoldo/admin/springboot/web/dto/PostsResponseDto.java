package com.jojoldo.admin.springboot.web.dto;

import com.jojoldo.admin.springboot.domain.post.Posts;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }

}
