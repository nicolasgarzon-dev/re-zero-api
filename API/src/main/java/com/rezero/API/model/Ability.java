package com.rezero.API.model;

import lombok.Data;

@Data
public class Ability {
    private String name;

    public Ability (String name) {
        this.name = name;
    }
}
