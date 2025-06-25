package com.rezero.API.controller;

import com.rezero.API.domain.FactionRepository;
import com.rezero.API.infrastructure.FactionrepositoryImpl;
import com.rezero.API.model.Faction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/factions")
public class FactionController {

    private final FactionRepository factionRepository;

    public FactionController(FactionRepository factionRepository) {
        this.factionRepository = factionRepository;
    }

    @GetMapping
    public List<Faction> getAllFactions() {
        return factionRepository.getAllFactions();  // facciones desde el repositorio
    }
    @GetMapping("/{name}")
    public ResponseEntity<Faction> getCharacterByName(@PathVariable String name) {
        return factionRepository.getFactionByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
