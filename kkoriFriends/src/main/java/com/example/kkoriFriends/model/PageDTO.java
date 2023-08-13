package com.example.kkoriFriends.model;

import lombok.Builder;

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
