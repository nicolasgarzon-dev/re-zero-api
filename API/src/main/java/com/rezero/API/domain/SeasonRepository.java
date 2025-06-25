package com.rezero.API.domain;

import com.rezero.API.model.Season;

import java.util.List;
import java.util.Optional;

public interface SeasonRepository {
    List<Season> getAllSeasons();
    Optional<Season> getSeasonByName(String name);
}