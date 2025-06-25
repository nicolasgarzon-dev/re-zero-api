package com.rezero.API.infrastructure;

import com.rezero.API.domain.AbilityRepository;
import com.rezero.API.model.Ability;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AbilityRepositoryImpl implements AbilityRepository {
    private final List<Ability> abilities =  List.of(
            new Ability("Return by Death"),         // Subaru Natsuki
            new Ability("Spirit Arts"),             // Emilia
            new Ability("Oni Transformation"),      // Rem
            new Ability("Blade Mastery"),           // Elsa Granhiert
            new Ability("Divine Protection of the Phoenix"), // Felt
            new Ability("Blessing of the Sword Saint"),      // Reinhard van Astrea
            new Ability("None"),                    // Petra Leyte
            new Ability("None"),                    // Rom
            new Ability("Beast Tamer"),             // Meili Portroute
            new Ability("Master Swordsman")        // Wilhelm van Astrea
    );

    @Override
    public List<Ability> getAllAbilities() {
        return abilities;
    }

    @Override
    public Optional<Ability> getAbilityByName(String name) {
        return abilities.stream()
                .filter(ability -> ability.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}
