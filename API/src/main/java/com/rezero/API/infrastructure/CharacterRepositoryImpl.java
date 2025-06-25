package com.rezero.API.infrastructure;

import com.rezero.API.domain.CharacterRepository;
import com.rezero.API.model.Ability;
import com.rezero.API.model.Faction;
import com.rezero.API.model.ReZeroCharacter;
import com.rezero.API.model.Season;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CharacterRepositoryImpl implements CharacterRepository {

    private final List<ReZeroCharacter> characters = List.of(
            new ReZeroCharacter ("Subaru Natsuki", new Ability("Return by Death"), new Faction("Emilia Camp"), new Season("Season 1")),
            new ReZeroCharacter ("Emilia", new Ability("Spirit Arts"), new Faction("Emilia Camp"), new Season("Season 1")),
            new ReZeroCharacter ("Rem", new Ability("Oni Transformation"), new Faction("Roswaal Household"), new Season("Season 1")),
            new ReZeroCharacter ("Ram", new Ability("Wind Magic"), new Faction("Roswaal Household"), new Season("Season 1")),
            new ReZeroCharacter ("Felt", new Ability("Stealing"), new Faction("Royal Selection"), new Season("Season 1")),
            new ReZeroCharacter ("Reinhard van Astrea", new Ability("Divine Protection"), new Faction("Royal Guard"), new Season("Season 1")),
            new ReZeroCharacter ("Petra Leyte", new Ability("None"), new Faction("Emilia Camp"), new Season("Season 1")),
            new ReZeroCharacter ("Rom", new Ability("None"), new Faction("Citizen"), new Season("Season 1")),
            new ReZeroCharacter ("Meili Portroute", new Ability("Beast Taming"), new Faction("Assassins"), new Season("Season 1")),
            new ReZeroCharacter ("Wilhelm van Astrea", new Ability("Swordsmanship"), new Faction("Royal Guard"), new Season("Season 1")),
            new ReZeroCharacter ("Elsa Granhiert", new Ability("Blade Mastery"), new Faction("Freelancer"), new Season("Season 1"))
    );

    @Override
    public List<ReZeroCharacter> getAllCharacters() {
        return characters;
    }

    @Override
    public Optional<ReZeroCharacter> getCharacterByName(String name) {
        return characters.stream()
                .filter(character -> character.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}
