package com.rezero.API.controller;

import com.rezero.API.domain.SeasonRepository;
import com.rezero.API.infrastructure.SeasonRepositoryImpl;
import com.rezero.API.model.Season;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seasons")
public class SeasonController {
    private final SeasonRepository seasonRepository;

    public SeasonController(SeasonRepository seasonRepository) {
        this.seasonRepository = seasonRepository;
    }

    @GetMapping
    public List<Season> getAllSeasons() {
        return seasonRepository.getAllSeasons();
    }

    @GetMapping("/{title}")
    public ResponseEntity<Season> getSeasonByTitle(@PathVariable String title) {
        return seasonRepository.getSeasonByName(title)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
