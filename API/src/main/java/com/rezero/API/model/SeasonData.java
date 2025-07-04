package com.rezero.API.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SeasonData {
        private String seasonTitle;
        private Ability ability;
        private Faction faction;
        private String imageUrl;

        public SeasonData(String seasonTitle, Ability ability, Faction faction, String imageUrl) {
            this.seasonTitle = seasonTitle;
            this.ability = ability;
            this.faction = faction;
            this.imageUrl = imageUrl;
        }
}
