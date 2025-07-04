package com.rezero.API.controller;

import com.rezero.API.domain.CharacterRepository;
import com.rezero.API.infrastructure.CharacterRepositoryImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rezero.API.model.ReZeroCharacter;
import java.util.List;

@RestController
@RequestMapping("api/characters")
public class CharacterController {
    private final CharacterRepository characterRepository;

    // Inyección de dependencias
    public CharacterController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ReZeroCharacter>> getAllCharacters() {
        return ResponseEntity.ok (characterRepository.getAllCharacters());  // De aqui salen los personajes, desde el repositorio
    }
    @GetMapping("/getByName/{name}")
    public ResponseEntity<ReZeroCharacter> getCharacterByName(@PathVariable String name) {
        return characterRepository.getCharacterByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
