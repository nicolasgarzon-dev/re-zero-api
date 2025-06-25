package com.rezero.API.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Season {
    private String title;

    public Season (String title) {
        this.title = title;
    }
}
