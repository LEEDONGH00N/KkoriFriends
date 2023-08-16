package com.example.kkoriFriends.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageDTO {
    private int totalPages;
    private Long totalElements;
    private int size;

    @Builder
    public PageDTO(int totalPages, Long totalElements, int size) {
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.size = size;
    }
}
