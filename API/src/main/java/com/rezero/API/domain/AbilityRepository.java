package com.rezero.API.domain;

import com.rezero.API.model.Ability;

import java.util.List;
import java.util.Optional;

public interface AbilityRepository {
    List<Ability> getAllAbilities();
    Optional<Ability> getAbilityByName(String name);
}
