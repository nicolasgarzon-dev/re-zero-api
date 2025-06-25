package com.rezero.API.infrastructure;

import com.rezero.API.domain.SeasonRepository;
import com.rezero.API.model.Season;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SeasonRepositoryImpl implements SeasonRepository {
    private final List<Season> seasons = List.of(
            new Season("Arc 1-3"),
            new Season("Arc 4"),
            new Season("Arc 4 (continued)")
    );

    @Override
    public List<Season> getAllSeasons() {
        return seasons;
    }

    @Override
    public Optional<Season> getSeasonByName(String title) {
        return seasons.stream()
                .filter(season -> season.getTitle().equalsIgnoreCase(title))
                .findFirst();
    }
}
