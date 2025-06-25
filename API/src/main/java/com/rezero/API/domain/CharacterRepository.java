package com.rezero.API.domain;

import com.rezero.API.model.ReZeroCharacter;

import java.util.List;
import java.util.Optional;

public interface CharacterRepository {
    List<ReZeroCharacter> getAllCharacters();
    Optional<ReZeroCharacter> getCharacterByName(String name);
}

