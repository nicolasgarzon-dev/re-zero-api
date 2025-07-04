package com.rezero.API.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReZeroCharacter {
        private String name;
        private List<SeasonData> seasons;
}
