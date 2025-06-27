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
            new ReZeroCharacter ("Subaru Natsuki",
                    new Ability("Return by Death"),
                    new Faction("Emilia Camp"),
                    new Season("Season 1"),
                    "https://th.bing.com/th/id/R.f871676ff983dbd6156006c5a4d11fb3?rik=Eu53D3lQNrPn4w&riu=http%3a%2f%2fwww.anime-planet.com%2fimages%2fcharacters%2fsubaru-natsuki-84534.jpg%3ft%3d1459770839&ehk=eWTyragieP4bNhaL8DxOshwDh9nv3oeWtEpICVbmzDQ%3d&risl=&pid=ImgRaw&r=0"),
            new ReZeroCharacter ("Emilia",
                    new Ability("Spirit Arts"),
                    new Faction("Emilia Camp"),
                    new Season("Season 1"),
                    "https://vignette.wikia.nocookie.net/animefigures/images/d/d6/Emilia_Rezero.png/revision/latest?cb=20171005144955"),
            new ReZeroCharacter ("Rem",
                    new Ability("Oni Transformation"),
                    new Faction("Roswaal Household"),
                    new Season("Season 1"),
                    "https://th.bing.com/th/id/R.29ed9d782fe56e9f4d5619dd9cc857ec?rik=NhDwloDPtJf%2biA&pid=ImgRaw&r=0"),
            new ReZeroCharacter ("Ram",
                    new Ability("Wind Magic"),
                    new Faction("Roswaal Household"),
                    new Season("Season 1"),
                    "https://i.pinimg.com/originals/e2/38/03/e23803a0f9ee3e746962dccfa7818008.png"),
            new ReZeroCharacter ("Felt",
                    new Ability("Stealing"),
                    new Faction("Royal Selection"),
                    new Season("Season 1"),
                    "https://th.bing.com/th/id/OIP.ZaUOyt_bvuxTGN334gmPrwHaE8?rs=1&pid=ImgDetMain"),
            new ReZeroCharacter ("Reinhard van Astrea",
                    new Ability("Divine Protection"),
                    new Faction("Royal Guard"),
                    new Season("Season 1"),
                    "https://vignette3.wikia.nocookie.net/rezero/images/4/49/Reinhard_van_Astrea_-_Re_Zero_Anime_BD_-_10.png/revision/latest?cb=20160831105138"),
            new ReZeroCharacter ("Petra Leyte",
                    new Ability("None"),
                    new Faction("Emilia Camp"),
                    new Season("Season 1"),
                    "https://th.bing.com/th/id/OIP.PPEqVHX8PP9n5_3EgMoScAHaEM?rs=1&pid=ImgDetMain"),
            new ReZeroCharacter ("Rom",
                    new Ability("None"),
                    new Faction("Citizen"),
                    new Season("Season 1"),
            "https://th.bing.com/th/id/OIP.9OnD68bz69UCNZWfZJ24dAHaHa?w=650&h=650&rs=1&pid=ImgDetMain"),
            new ReZeroCharacter ("Meili Portroute",
                    new Ability("Beast Taming"),
                    new Faction("Assassins"),
                    new Season("Season 1"),
                    "https://th.bing.com/th/id/OIP.lPztW9QydH-ktkV5UaaU9AAAAA?rs=1&pid=ImgDetMain"),
            new ReZeroCharacter ("Wilhelm van Astrea",
                    new Ability("Swordsmanship"),
                    new Faction("Royal Guard"),
                    new Season("Season 1"),
                    "https://s4.anilist.co/file/anilistcdn/character/large/90179-xIUlmTc9DpYo.jpg"),
            new ReZeroCharacter ("Elsa Granhiert",
                    new Ability("Blade Mastery"),
                    new Faction("Freelancer"),
                    new Season("Season 1"),
                    "https://th.bing.com/th/id/OIP.5GPybUWzA_x0eikCpqF0QAHaEK?rs=1&pid=ImgDetMain"),
            new ReZeroCharacter("Beatrice",
                    new Ability("Yin Magic"),
                    new Faction("Emilia Camp"),
                    new Season("Season 1"),
                    "https://vignette.wikia.nocookie.net/rezero/images/7/71/Beatrice_Anime.png/revision/latest?cb=20160424195807"),

            new ReZeroCharacter("Petelgeuse Romanee-Conti",
                    new Ability("Unseen Hand"),
                    new Faction("Witch Cult"),
                    new Season("Season 1"),
                    "https://vignette.wikia.nocookie.net/rezero/images/1/1f/Betelgeuse_Opening.png/revision/latest?cb=20160703180106"),

            new ReZeroCharacter("Mimi Pearlbaton",
                    new Ability("Beast Transformation"),
                    new Faction("Crusch Camp"),
                    new Season("Season 2"),
                    "https://img.wattpad.com/7f0b84a5cc1fe7822702a52ef5f8ca45589356bd/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6a557776677230556c58507962513d3d2d313332393537333936302e313735313733356634633862383131393131383339313533373637332e6a7067?s=fit&w=720&h=720"),

            new ReZeroCharacter("Hetaro Pearlbaton",
                    new Ability("Beast Transformation"),
                    new Faction("Crusch Camp"),
                    new Season("Season 2"),
                    "https://th.bing.com/th/id/OIP.RpdP1u8C4z3hhyCLLiYJfgHaFJ?rs=1&pid=ImgDetMain"),

            new ReZeroCharacter("Tivey Pearlbaton",
                    new Ability("Beast Transformation"),
                    new Faction("Crusch Camp"),
                    new Season("Season 2"),
                    "https://otakotaku.com/asset/img/character/2021/03/tivey-pearlbaton-6050341ec078bp.jpg"),

            new ReZeroCharacter("Julius Juukulius",
                    new Ability("Spirit Arts"),
                    new Faction("Anastasia Camp"),
                    new Season("Season 2"),
                    "https://th.bing.com/th/id/R.5af9be414ea72d524ce246979e4a05e0?rik=kHndvGuGqAukGA&riu=http%3a%2f%2fvignette3.wikia.nocookie.net%2frezero%2fimages%2fe%2feb%2fJulius_-_Anime.png%2frevision%2flatest%3fcb%3d20161116221750%26path-prefix%3des&ehk=m7zIjV1o59iDgaoLy2Oy1LtE%2fFxD0H2SHrZZy7X%2f5uU%3d&risl=&pid=ImgRaw&r=0"),

            new ReZeroCharacter("Aldebaran",
                    new Ability("Unknown"),
                    new Faction("Priscilla Camp"),
                    new Season("Season 1"),
                    "https://vignette.wikia.nocookie.net/rezero/images/7/7d/Al_Anime.png/revision/latest?cb=20170526193611&path-prefix=pl"),

            new ReZeroCharacter("Priscilla Barielle",
                    new Ability("Commanding Presence"),
                    new Faction("Priscilla Camp"),
                    new Season("Season 1"),
                    "https://th.bing.com/th/id/OIP.5-w4aCYSvnIZcfq03S4aVwAAAA?rs=1&pid=ImgDetMain"),

            new ReZeroCharacter("Felix Argyle",
                    new Ability("Healing Magic"),
                    new Faction("Crusch Camp"),
                    new Season("Season 1"),
                    "https://cdn.myanimelist.net/images/characters/14/431176.jpg"),

            new ReZeroCharacter("Crusch Karsten",
                    new Ability("Wind Magic"),
                    new Faction("Crusch Camp"),
                    new Season("Season 1"),
                    "https://th.bing.com/th/id/OIP.60Kjuj5Kmu-w4QFxo_vLxAHaHW?rs=1&pid=ImgDetMain"),

            new ReZeroCharacter("Anastasia Hoshin",
                    new Ability("Tactician"),
                    new Faction("Anastasia Camp"),
                    new Season("Season 1"),
                    "https://th.bing.com/th/id/OIP.ItogR0kScRUzE0R1R-AA9wHaJh?rs=1&pid=ImgDetMain"),

            new ReZeroCharacter("Puck",
                    new Ability("Ice Magic"),
                    new Faction("Spirits"),
                    new Season("Season 1"),
                    "https://th.bing.com/th/id/R.898a5dfe0a462a2c327357b9d4a17ca6?rik=yeXLa%2f5iJIf2Mg&pid=ImgRaw&r=0"),

            new ReZeroCharacter("White Whale",
                    new Ability("Fog Generation"),
                    new Faction("Mabeast"),
                    new Season("Season 1"),
                    "https://vignette.wikia.nocookie.net/vsbattles/images/4/4a/Gear--%E4%B8%89%E5%A4%A7%E9%AD%94%E7%8D%A3-%E7%99%BD%E9%AF%A8_Render.png/revision/latest?cb=20200210165501"),

            new ReZeroCharacter("Otto Suwen",
                    new Ability("Divine Protection of Soul Language"),
                    new Faction("Emilia Camp"),
                    new Season("Season 1"),
                    "https://tse2.mm.bing.net/th/id/OIP.9HDJPyBbuadoLQMDgsQa6gHaEK?rs=1&pid=ImgDetMain"),

            new ReZeroCharacter("Ricardo Welkin",
                    new Ability("Beast Strength"),
                    new Faction("Anastasia Camp"),
                    new Season("Season 1"),
                    "https://th.bing.com/th/id/OIP.4AOi6VjHiobQWU6tr4VnfQHaEK?rs=1&pid=ImgDetMain"),

            new ReZeroCharacter("Bandit A",
                    new Ability("Unknown"),
                    new Faction("Bandits"),
                    new Season("Season 1"),
                    "https://tse1.mm.bing.net/th/id/OIP.ABovZAKSEFIn1iYpKA9Y7gFNC7?rs=1&pid=ImgDetMain"),

            new ReZeroCharacter("Bandit B",
                    new Ability("Unknown"),
                    new Faction("Bandits"),
                    new Season("Season 1"),
                    "https://th.bing.com/th/id/OIP.GhiQnIr6EdGm3bNyR06iyAHaEK?w=298&h=167&c=10&rs=1&bgcl=fffffe&r=0&o=6&cb=iavawebpc1&dpr=1.5&pid=23.1")

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
