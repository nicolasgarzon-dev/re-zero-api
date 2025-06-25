package com.rezero.API.controller;

import com.rezero.API.domain.AbilityRepository;
import com.rezero.API.model.Ability;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/abilities")
public class AbilityController {

    private final AbilityRepository abilityRepository;

    public AbilityController(AbilityRepository abilityRepository) {
        this.abilityRepository = abilityRepository;
    }

    @GetMapping
    public List<Ability> getAllAbilities() {
        return abilityRepository.getAllAbilities();
    }

    @GetMapping("/{name}")
    public ResponseEntity<Ability> getAbilityByName(@PathVariable String name) {
        return abilityRepository.getAbilityByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
