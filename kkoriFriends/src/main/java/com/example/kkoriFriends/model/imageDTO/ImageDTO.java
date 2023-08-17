package com.example.kkoriFriends.model.imageDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImageDTO {
    private String url;

    public ImageDTO(String url) {
        this.url = url;
    }
}
