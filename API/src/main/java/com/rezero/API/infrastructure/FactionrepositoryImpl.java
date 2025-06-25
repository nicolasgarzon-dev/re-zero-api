package com.rezero.API.infrastructure;

import com.rezero.API.domain.FactionRepository;
import com.rezero.API.model.Faction;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FactionrepositoryImpl implements FactionRepository {
    private final List<Faction> factions = List.of(
            new Faction("Emilia Camp"),
            new Faction("Citizen"),
            new Faction("Royal Guard"),
            new Faction("Witch's Cult")
    );

    @Override
    public List<Faction> getAllFactions() {
        return factions;
    }

    @Override
    public Optional<Faction> getFactionByName(String name) {
        return factions.stream()
                .filter(faction -> faction.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}
