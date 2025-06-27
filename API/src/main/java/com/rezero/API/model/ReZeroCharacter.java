package com.rezero.API.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ReZeroCharacter {
    private String name;
    private Ability ability;
    private Faction faction;
    private Season season;
    private String imageUrl;

    public ReZeroCharacter(String name, Ability ability, Faction faction, Season season, String imageUrl){
        this.name = name;
        this.ability = ability;
        this.faction = faction;
        this.season = season;
        this.imageUrl = imageUrl;
    }
}
