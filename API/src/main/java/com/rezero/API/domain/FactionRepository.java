package com.rezero.API.domain;

import com.rezero.API.model.Faction;

import java.util.List;
import java.util.Optional;

public interface FactionRepository {
    List<Faction> getAllFactions();
    Optional<Faction> getFactionByName(String name);
}
