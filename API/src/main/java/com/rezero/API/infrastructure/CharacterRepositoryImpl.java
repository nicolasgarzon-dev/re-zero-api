package com.rezero.API.infrastructure;

import com.rezero.API.domain.CharacterRepository;
import com.rezero.API.model.Ability;
import com.rezero.API.model.Faction;
import com.rezero.API.model.ReZeroCharacter;
import com.rezero.API.model.SeasonData;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class CharacterRepositoryImpl implements CharacterRepository {

    private final List<ReZeroCharacter> characters = List.of(
         new ReZeroCharacter("Subaru Natsuki",
                    Arrays.asList(
                            new SeasonData("All", new Ability("Return by Death, Authority of Sloth (unstable)"), new Faction("Emilia Camp"), "https://th.bing.com/th/id/R.f871676ff983dbd6156006c5a4d11fb3?rik=Eu53D3lQNrPn4w&riu=http%3a%2f%2fwww.anime-planet.com%2fimages%2fcharacters%2fsubaru-natsuki-84534.jpg%3ft%3d1459770839&ehk=eWTyragieP4bNhaL8DxOshwDh9nv3oeWtEpICVbmzDQ%3d&risl=&pid=ImgRaw&r=0"),
                            new SeasonData("Season 1", new Ability("Return by Death"), new Faction("Emilia Camp"), "https://th.bing.com/th/id/R.f871676ff983dbd6156006c5a4d11fb3?rik=Eu53D3lQNrPn4w&riu=http%3a%2f%2fwww.anime-planet.com%2fimages%2fcharacters%2fsubaru-natsuki-84534.jpg%3ft%3d1459770839&ehk=eWTyragieP4bNhaL8DxOshwDh9nv3oeWtEpICVbmzDQ%3d&risl=&pid=ImgRaw&r=0"),
                            new SeasonData("Season 2", new Ability("Return by Death, Authority of Sloth (unstable)"), new Faction("Emilia Camp"), "https://th.bing.com/th/id/R.f871676ff983dbd6156006c5a4d11fb3?rik=Eu53D3lQNrPn4w&riu=http%3a%2f%2fwww.anime-planet.com%2fimages%2fcharacters%2fsubaru-natsuki-84534.jpg%3ft%3d1459770839&ehk=eWTyragieP4bNhaL8DxOshwDh9nv3oeWtEpICVbmzDQ%3d&risl=&pid=ImgRaw&r=0")
                    )
         ),
         new ReZeroCharacter("Emilia",
                    Arrays.asList(
                            new SeasonData("All", new Ability("Spirit Arts"), new Faction("Emilia Camp"), "https://vignette.wikia.nocookie.net/animefigures/images/d/d6/Emilia_Rezero.png/revision/latest?cb=20171005144955"),
                            new SeasonData("Season 1", new Ability("Spirit Arts"), new Faction("Emilia Camp"), "https://vignette.wikia.nocookie.net/animefigures/images/d/d6/Emilia_Rezero.png/revision/latest?cb=20171005144955"),
                            new SeasonData("Season 2", new Ability("Spirit Arts"), new Faction("Emilia Camp"), "https://vignette.wikia.nocookie.net/animefigures/images/d/d6/Emilia_Rezero.png/revision/latest?cb=20171005144955")
                    )
            ),
         new ReZeroCharacter("Rem",
                 Arrays.asList(
                         new SeasonData("All", new Ability("Oni Transformation"), new Faction("Emilia Camp"), "https://th.bing.com/th/id/R.29ed9d782fe56e9f4d5619dd9cc857ec?rik=NhDwloDPtJf%2biA&pid=ImgRaw&r=0"),
                         new SeasonData("Season 1", new Ability("Oni Transformation"), new Faction("Roswaal Household"), "https://th.bing.com/th/id/R.29ed9d782fe56e9f4d5619dd9cc857ec?rik=NhDwloDPtJf%2biA&pid=ImgRaw&r=0"),
                         new SeasonData("Season 2", new Ability("Unknown"), new Faction("Emilia Camp"), "https://tse3.mm.bing.net/th/id/OIP.zxYaART2ftwYHhI4Q3H0dAHaD4?cb=thvnext&w=1200&h=630&rs=1&pid=ImgDetMain&o=7&rm=3")
                 )
         ),
         new ReZeroCharacter("Ram",
                 Arrays.asList(
                         new SeasonData("All", new Ability("Wind Magic"), new Faction("Roswaal Household"), "https://i.pinimg.com/originals/e2/38/03/e23803a0f9ee3e746962dccfa7818008.png"),
                         new SeasonData("Season 1", new Ability("Wind Magic"), new Faction("Roswaal Household"), "https://i.pinimg.com/originals/e2/38/03/e23803a0f9ee3e746962dccfa7818008.png"),
                         new SeasonData("Season 2", new Ability("Wind Magic"), new Faction("Roswaal Household"), "https://i.pinimg.com/originals/e2/38/03/e23803a0f9ee3e746962dccfa7818008.png")
                 )
         ),

         new ReZeroCharacter("Felt",
                 Arrays.asList(
                         new SeasonData("All", new Ability("Stealing"), new Faction("Royal Selection"), "https://th.bing.com/th/id/OIP.ZaUOyt_bvuxTGN334gmPrwHaE8?rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 1", new Ability("Stealing"), new Faction("Royal Selection"), "https://th.bing.com/th/id/OIP.ZaUOyt_bvuxTGN334gmPrwHaE8?rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 2", new Ability("Stealing"), new Faction("Felt Camp"), "https://th.bing.com/th/id/OIP.ZaUOyt_bvuxTGN334gmPrwHaE8?rs=1&pid=ImgDetMain")
                 )
         ),

         new ReZeroCharacter("Reinhard van Astrea",
                 Arrays.asList(
                         new SeasonData("All", new Ability("Divine Protection"), new Faction("Royal Guard"), "https://vignette3.wikia.nocookie.net/rezero/images/4/49/Reinhard_van_Astrea_-_Re_Zero_Anime_BD_-_10.png/revision/latest?cb=20160831105138"),
                         new SeasonData("Season 1", new Ability("Divine Protection"), new Faction("Royal Guard"), "https://vignette3.wikia.nocookie.net/rezero/images/4/49/Reinhard_van_Astrea_-_Re_Zero_Anime_BD_-_10.png/revision/latest?cb=20160831105138"),
                         new SeasonData("Season 2", new Ability("Divine Protection"), new Faction("Felt Camp"), "https://vignette3.wikia.nocookie.net/rezero/images/4/49/Reinhard_van_Astrea_-_Re_Zero_Anime_BD_-_10.png/revision/latest?cb=20160831105138")
                 )
         ),
         new ReZeroCharacter("Petra Leyte",
                 Arrays.asList(
                         new SeasonData("All", new Ability("None"), new Faction("Emilia Camp"), "https://th.bing.com/th/id/OIP.PPEqVHX8PP9n5_3EgMoScAHaEM?rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 1", new Ability("None"), new Faction("Emilia Camp"), "https://th.bing.com/th/id/OIP.PPEqVHX8PP9n5_3EgMoScAHaEM?rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 2", new Ability("None"), new Faction("Emilia Camp"), "https://th.bing.com/th/id/OIP.PPEqVHX8PP9n5_3EgMoScAHaEM?rs=1&pid=ImgDetMain")
                 )
         ),

         new ReZeroCharacter("Rom",
                 Arrays.asList(
                         new SeasonData("All", new Ability("None"), new Faction("Citizen"), "https://th.bing.com/th/id/OIP.9OnD68bz69UCNZWfZJ24dAHaHa?w=650&h=650&rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 1", new Ability("None"), new Faction("Citizen"), "https://th.bing.com/th/id/OIP.9OnD68bz69UCNZWfZJ24dAHaHa?w=650&h=650&rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 2", new Ability("None"), new Faction("Citizen"), "https://th.bing.com/th/id/OIP.9OnD68bz69UCNZWfZJ24dAHaHa?w=650&h=650&rs=1&pid=ImgDetMain")
                 )
         ),

         new ReZeroCharacter("Meili Portroute",
                 Arrays.asList(
                         new SeasonData("All", new Ability("Beast Taming"), new Faction("Assassins"), "https://th.bing.com/th/id/OIP.lPztW9QydH-ktkV5UaaU9AAAAA?rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 1", new Ability("Beast Taming"), new Faction("Assassins"), "https://th.bing.com/th/id/OIP.lPztW9QydH-ktkV5UaaU9AAAAA?rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 2", new Ability("Beast Taming"), new Faction("Assassins"), "https://th.bing.com/th/id/OIP.lPztW9QydH-ktkV5UaaU9AAAAA?rs=1&pid=ImgDetMain")
                 )
         ),

         new ReZeroCharacter("Wilhelm van Astrea",
                 Arrays.asList(
                         new SeasonData("All", new Ability("Swordsmanship"), new Faction("Royal Guard"), "https://s4.anilist.co/file/anilistcdn/character/large/90179-xIUlmTc9DpYo.jpg"),
                         new SeasonData("Season 1", new Ability("Swordsmanship"), new Faction("Royal Guard"), "https://s4.anilist.co/file/anilistcdn/character/large/90179-xIUlmTc9DpYo.jpg"),
                         new SeasonData("Season 2", new Ability("Swordsmanship"), new Faction("Royal Guard"), "https://s4.anilist.co/file/anilistcdn/character/large/90179-xIUlmTc9DpYo.jpg")
                 )
         ),

         new ReZeroCharacter("Elsa Granhiert",
                 Arrays.asList(
                         new SeasonData("All", new Ability("Blade Mastery"), new Faction("Freelancer"), "https://th.bing.com/th/id/OIP.5GPybUWzA_x0eikCpqF0QAHaEK?rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 1", new Ability("Blade Mastery"), new Faction("Freelancer"), "https://th.bing.com/th/id/OIP.5GPybUWzA_x0eikCpqF0QAHaEK?rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 2", new Ability("Blade Mastery"), new Faction("Freelancer"), "https://th.bing.com/th/id/OIP.5GPybUWzA_x0eikCpqF0QAHaEK?rs=1&pid=ImgDetMain")
                 )
         ),

         new ReZeroCharacter("Beatrice",
                 Arrays.asList(
                         new SeasonData("All", new Ability("Yin Magic"), new Faction("Emilia Camp"), "https://vignette.wikia.nocookie.net/rezero/images/7/71/Beatrice_Anime.png/revision/latest?cb=20160424195807"),
                         new SeasonData("Season 1", new Ability("Yin Magic"), new Faction("Emilia Camp"), "https://vignette.wikia.nocookie.net/rezero/images/7/71/Beatrice_Anime.png/revision/latest?cb=20160424195807"),
                         new SeasonData("Season 2", new Ability("Yin Magic"), new Faction("Emilia Camp"), "https://vignette.wikia.nocookie.net/rezero/images/7/71/Beatrice_Anime.png/revision/latest?cb=20160424195807")
                 )
         ),

         new ReZeroCharacter("Petelgeuse Romanee-Conti",
                 Arrays.asList(
                         new SeasonData("All", new Ability("Unseen Hand"), new Faction("Witch Cult"), "https://vignette.wikia.nocookie.net/rezero/images/1/1f/Betelgeuse_Opening.png/revision/latest?cb=20160703180106"),
                         new SeasonData("Season 1", new Ability("Unseen Hand"), new Faction("Witch Cult"), "https://vignette.wikia.nocookie.net/rezero/images/1/1f/Betelgeuse_Opening.png/revision/latest?cb=20160703180106"),
                         new SeasonData("Season 2", new Ability("Unseen Hand"), new Faction("Witch Cult"), "https://th.bing.com/th/id/R.97ffab341a239d05189e56b3246443b3?rik=NfkegHmnUJ5sHA&pid=ImgRaw&r=0")
                 )
         ),

         new ReZeroCharacter("Mimi Pearlbaton",
                 Arrays.asList(
                         new SeasonData("All", new Ability("Beast Transformation"), new Faction("Crusch Camp"), "https://img.wattpad.com/7f0b84a5cc1fe7822702a52ef5f8ca45589356bd/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6a557776677230556c58507962513d3d2d313332393537333936302e313735313733356634633862383131393131383339313533373637332e6a7067?s=fit&w=720&h=720"),
                         new SeasonData("Season 1", new Ability("Beast Transformation"), new Faction("Crusch Camp"), "https://img.wattpad.com/7f0b84a5cc1fe7822702a52ef5f8ca45589356bd/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6a557776677230556c58507962513d3d2d313332393537333936302e313735313733356634633862383131393131383339313533373637332e6a7067?s=fit&w=720&h=720"),
                         new SeasonData("Season 2", new Ability("Beast Transformation"), new Faction("Crusch Camp"), "https://img.wattpad.com/7f0b84a5cc1fe7822702a52ef5f8ca45589356bd/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6a557776677230556c58507962513d3d2d313332393537333936302e313735313733356634633862383131393131383339313533373637332e6a7067?s=fit&w=720&h=720")
                 )
         ),

         new ReZeroCharacter("Hetaro Pearlbaton",
                 Arrays.asList(
                         new SeasonData("All", new Ability("Beast Transformation"), new Faction("Crusch Camp"), "https://th.bing.com/th/id/OIP.RpdP1u8C4z3hhyCLLiYJfgHaFJ?rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 1", new Ability("Beast Transformation"), new Faction("Crusch Camp"), "https://th.bing.com/th/id/OIP.RpdP1u8C4z3hhyCLLiYJfgHaFJ?rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 2", new Ability("Beast Transformation"), new Faction("Crusch Camp"), "https://th.bing.com/th/id/OIP.RpdP1u8C4z3hhyCLLiYJfgHaFJ?rs=1&pid=ImgDetMain")
                 )
         ),

        new ReZeroCharacter("Tivey Pearlbaton",
                Arrays.asList(
                        new SeasonData("All", new Ability("Beast Transformation"), new Faction("Crusch Camp"), "https://otakotaku.com/asset/img/character/2021/03/tivey-pearlbaton-6050341ec078bp.jpg"),
                        new SeasonData("Season 1", new Ability("Beast Transformation"), new Faction("Crusch Camp"), "https://otakotaku.com/asset/img/character/2021/03/tivey-pearlbaton-6050341ec078bp.jpg"),
                        new SeasonData("Season 2", new Ability("Beast Transformation"), new Faction("Crusch Camp"), "https://otakotaku.com/asset/img/character/2021/03/tivey-pearlbaton-6050341ec078bp.jpg")
                )
        ),

        new ReZeroCharacter("Julius Juukulius",
                Arrays.asList(
                        new SeasonData("All", new Ability("Spirit Arts"), new Faction("Anastasia Camp"), "https://th.bing.com/th/id/R.5af9be414ea72d524ce246979e4a05e0?rik=kHndvGuGqAukGA&riu=http%3a%2f%2fvignette3.wikia.nocookie.net%2frezero%2fimages%2fe%2feb%2fJulius_-_Anime.png%2frevision%2flatest%3fcb%3d20161116221750%26path-prefix%3des&ehk=m7zIjV1o59iDgaoLy2Oy1LtE%2fFxD0H2SHrZZy7X%2f5uU%3d&risl=&pid=ImgRaw&r=0"),
                        new SeasonData("Season 1", new Ability("Spirit Arts"), new Faction("Anastasia Camp"), "https://th.bing.com/th/id/R.5af9be414ea72d524ce246979e4a05e0?rik=kHndvGuGqAukGA&riu=http%3a%2f%2fvignette3.wikia.nocookie.net%2frezero%2fimages%2fe%2feb%2fJulius_-_Anime.png%2frevision%2flatest%3fcb%3d20161116221750%26path-prefix%3des&ehk=m7zIjV1o59iDgaoLy2Oy1LtE%2fFxD0H2SHrZZy7X%2f5uU%3d&risl=&pid=ImgRaw&r=0"),
                        new SeasonData("Season 2", new Ability("Spirit Arts"), new Faction("Anastasia Camp"), "https://th.bing.com/th/id/R.5af9be414ea72d524ce246979e4a05e0?rik=kHndvGuGqAukGA&riu=http%3a%2f%2fvignette3.wikia.nocookie.net%2frezero%2fimages%2fe%2feb%2fJulius_-_Anime.png%2frevision%2flatest%3fcb%3d20161116221750%26path-prefix%3des&ehk=m7zIjV1o59iDgaoLy2Oy1LtE%2fFxD0H2SHrZZy7X%2f5uU%3d&risl=&pid=ImgRaw&r=0")
                )
        ),

        new ReZeroCharacter("Aldebaran",
                    Arrays.asList(
                            new SeasonData("All", new Ability("Unknown"), new Faction("Priscilla Camp"), "https://vignette.wikia.nocookie.net/rezero/images/7/7d/Al_Anime.png/revision/latest?cb=20170526193611&path-prefix=pl"),
                            new SeasonData("Season 1", new Ability("Unknown"), new Faction("Priscilla Camp"), "https://vignette.wikia.nocookie.net/rezero/images/7/7d/Al_Anime.png/revision/latest?cb=20170526193611&path-prefix=pl"),
                            new SeasonData("Season 2", new Ability("Unknown"), new Faction("Priscilla Camp"), "https://vignette.wikia.nocookie.net/rezero/images/7/7d/Al_Anime.png/revision/latest?cb=20170526193611&path-prefix=pl")
                    )
        ),

        new ReZeroCharacter("Priscilla Barielle",
                Arrays.asList(
                        new SeasonData("All", new Ability("Commanding Presence"), new Faction("Priscilla Camp"), "https://th.bing.com/th/id/OIP.5-w4aCYSvnIZcfq03S4aVwAAAA?rs=1&pid=ImgDetMain"),
                        new SeasonData("Season 1", new Ability("Commanding Presence"), new Faction("Priscilla Camp"), "https://th.bing.com/th/id/OIP.5-w4aCYSvnIZcfq03S4aVwAAAA?rs=1&pid=ImgDetMain"),
                        new SeasonData("Season 2", new Ability("Commanding Presence"), new Faction("Priscilla Camp"), "https://th.bing.com/th/id/OIP.5-w4aCYSvnIZcfq03S4aVwAAAA?rs=1&pid=ImgDetMain")
                )
        ),

        new ReZeroCharacter("Felix Argyle",
                Arrays.asList(
                        new SeasonData("All", new Ability("Healing Magic"), new Faction("Crusch Camp"), "https://cdn.myanimelist.net/images/characters/14/431176.jpg"),
                        new SeasonData("Season 1", new Ability("Healing Magic"), new Faction("Crusch Camp"), "https://cdn.myanimelist.net/images/characters/14/431176.jpg"),
                        new SeasonData("Season 2", new Ability("Healing Magic"), new Faction("Crusch Camp"), "https://cdn.myanimelist.net/images/characters/14/431176.jpg")
                )
        ),

        new ReZeroCharacter("Crusch Karsten",
                Arrays.asList(
                        new SeasonData("All", new Ability("Wind Magic"), new Faction("Crusch Camp"), "https://th.bing.com/th/id/OIP.60Kjuj5Kmu-w4QFxo_vLxAHaHW?rs=1&pid=ImgDetMain"),
                        new SeasonData("Season 1", new Ability("Wind Magic"), new Faction("Crusch Camp"), "https://th.bing.com/th/id/OIP.60Kjuj5Kmu-w4QFxo_vLxAHaHW?rs=1&pid=ImgDetMain"),
                        new SeasonData("Season 2", new Ability("Wind Magic"), new Faction("Crusch Camp"), "https://th.bing.com/th/id/OIP.60Kjuj5Kmu-w4QFxo_vLxAHaHW?rs=1&pid=ImgDetMain")
                )
        ),

        new ReZeroCharacter("Anastasia Hoshin",
                Arrays.asList(
                        new SeasonData("All", new Ability("Tactician"), new Faction("Anastasia Camp"), "https://th.bing.com/th/id/OIP.ItogR0kScRUzE0R1R-AA9wHaJh?rs=1&pid=ImgDetMain"),
                        new SeasonData("Season 1", new Ability("Tactician"), new Faction("Anastasia Camp"), "https://th.bing.com/th/id/OIP.ItogR0kScRUzE0R1R-AA9wHaJh?rs=1&pid=ImgDetMain"),
                        new SeasonData("Season 2", new Ability("Tactician"), new Faction("Anastasia Camp"), "https://th.bing.com/th/id/OIP.ItogR0kScRUzE0R1R-AA9wHaJh?rs=1&pid=ImgDetMain")
                )
        ),

        new ReZeroCharacter("Puck",
                Arrays.asList(
                        new SeasonData("All", new Ability("Ice Magic"), new Faction("Spirits"), "https://th.bing.com/th/id/R.898a5dfe0a462a2c327357b9d4a17ca6?rik=yeXLa%2f5iJIf2Mg&pid=ImgRaw&r=0"),
                        new SeasonData("Season 1", new Ability("Ice Magic"), new Faction("Spirits"), "https://th.bing.com/th/id/R.898a5dfe0a462a2c327357b9d4a17ca6?rik=yeXLa%2f5iJIf2Mg&pid=ImgRaw&r=0"),
                        new SeasonData("Season 2", new Ability("Ice Magic"), new Faction("Spirits"), "https://th.bing.com/th/id/R.898a5dfe0a462a2c327357b9d4a17ca6?rik=yeXLa%2f5iJIf2Mg&pid=ImgRaw&r=0")
                )
        ),

        new ReZeroCharacter("White Whale",
                Arrays.asList(
                        new SeasonData("All", new Ability("Fog Generation"), new Faction("Mabeast"), "https://vignette.wikia.nocookie.net/vsbattles/images/4/4a/Gear--%E4%B8%89%E5%A4%A7%E9%AD%94%E7%8D%A3-%E7%99%BD%E9%AF%A8_Render.png/revision/latest?cb=20200210165501"),
                        new SeasonData("Season 1", new Ability("Fog Generation"), new Faction("Mabeast"), "https://vignette.wikia.nocookie.net/vsbattles/images/4/4a/Gear--%E4%B8%89%E5%A4%A7%E9%AD%94%E7%8D%A3-%E7%99%BD%E9%AF%A8_Render.png/revision/latest?cb=20200210165501"),
                        new SeasonData("Season 2", new Ability("Fog Generation"), new Faction("Mabeast"), "https://vignette.wikia.nocookie.net/vsbattles/images/4/4a/Gear--%E4%B8%89%E5%A4%A7%E9%AD%94%E7%8D%A3-%E7%99%BD%E9%AF%A8_Render.png/revision/latest?cb=20200210165501")
                )
        ),
        new ReZeroCharacter("Otto Suwen",
                Arrays.asList(
                        new SeasonData("All", new Ability("Spirit Whisperer"), new Faction("Emilia Camp"), "https://tse2.mm.bing.net/th/id/OIP.9HDJPyBbuadoLQMDgsQa6gHaEK?rs=1&pid=ImgDetMain"),
                        new SeasonData("Season 1", new Ability("Unknown"), new Faction("Unknown"), "https://tse2.mm.bing.net/th/id/OIP.9HDJPyBbuadoLQMDgsQa6gHaEK?rs=1&pid=ImgDetMain"),
                        new SeasonData("Season 2", new Ability("Spirit Whisperer"), new Faction("Emilia Camp"), "https://tse2.mm.bing.net/th/id/OIP.9HDJPyBbuadoLQMDgsQa6gHaEK?rs=1&pid=ImgDetMain")
                )
        ),
        new ReZeroCharacter("Ricardo Welkin",
                 Arrays.asList(
                         new SeasonData("All", new Ability("Beast Strength"), new Faction("Anastasia Camp"), "https://th.bing.com/th/id/OIP.4AOi6VjHiobQWU6tr4VnfQHaEK?rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 1", new Ability("Beast Strength"), new Faction("Anastasia Camp"), "https://th.bing.com/th/id/OIP.4AOi6VjHiobQWU6tr4VnfQHaEK?rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 2", new Ability("Beast Strength"), new Faction("Anastasia Camp"), "https://th.bing.com/th/id/OIP.4AOi6VjHiobQWU6tr4VnfQHaEK?rs=1&pid=ImgDetMain")
                 )
         ),
        new ReZeroCharacter("Bandit A",
                 Arrays.asList(
                         new SeasonData("All", new Ability("Unknown"), new Faction("Bandits"), "https://tse1.mm.bing.net/th/id/OIP.ABovZAKSEFIn1iYpKA9Y7gFNC7?rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 1", new Ability("Unknown"), new Faction("Bandits"), "https://tse1.mm.bing.net/th/id/OIP.ABovZAKSEFIn1iYpKA9Y7gFNC7?rs=1&pid=ImgDetMain"),
                         new SeasonData("Season 2", new Ability("Unknown"), new Faction("Bandits"), "https://tse1.mm.bing.net/th/id/OIP.ABovZAKSEFIn1iYpKA9Y7gFNC7?rs=1&pid=ImgDetMain")
                 )
         ),

        new ReZeroCharacter("Bandit B",
                 Arrays.asList(
                         new SeasonData("All", new Ability("Unknown"), new Faction("Bandits"), "https://th.bing.com/th/id/OIP.GhiQnIr6EdGm3bNyR06iyAHaEK?w=298&h=167&c=10&rs=1&bgcl=fffffe&r=0&o=6&cb=iavawebpc1&dpr=1.5&pid=23.1"),
                         new SeasonData("Season 1", new Ability("Unknown"), new Faction("Bandits"), "https://th.bing.com/th/id/OIP.GhiQnIr6EdGm3bNyR06iyAHaEK?w=298&h=167&c=10&rs=1&bgcl=fffffe&r=0&o=6&cb=iavawebpc1&dpr=1.5&pid=23.1"),
                         new SeasonData("Season 2", new Ability("Unknown"), new Faction("Bandits"), "https://th.bing.com/th/id/OIP.GhiQnIr6EdGm3bNyR06iyAHaEK?w=298&h=167&c=10&rs=1&bgcl=fffffe&r=0&o=6&cb=iavawebpc1&dpr=1.5&pid=23.1")
                 )
         ),
        new ReZeroCharacter("Garfiel Tinsel",
                 Arrays.asList(
                         new SeasonData("All", new Ability("Beast Transformation"), new Faction("Emilia Camp"), "https://tse4.mm.bing.net/th/id/OIP.fNpTAVY2y5on_NHe02unngAAAA?cb=thvnext&w=225&h=350&rs=1&pid=ImgDetMain&o=7&rm=3"),
                         new SeasonData("Season 2", new Ability("Beast Transformation"), new Faction("Emilia Camp"), "https://tse4.mm.bing.net/th/id/OIP.fNpTAVY2y5on_NHe02unngAAAA?cb=thvnext&w=225&h=350&rs=1&pid=ImgDetMain&o=7&rm=3")
                                    )
                            ),
        new ReZeroCharacter("Ryuzu Meyer",
                Arrays.asList(
                        new SeasonData("All", new Ability("Clone Transfer Consciousness"), new Faction("Sanctuary"), "https://translationchicken.files.wordpress.com/2017/01/cwuadpxuqaakfbv.jpg"),
                        new SeasonData("Season 2", new Ability("Clone Transfer Consciousness"), new Faction("Sanctuary"), "https://translationchicken.files.wordpress.com/2017/01/cwuadpxuqaakfbv.jpg")
                )
        ),

        new ReZeroCharacter("Echidna",
                     Arrays.asList(
                             new SeasonData("All", new Ability("Witch of Greed"), new Faction("Witches of Sin"), "https://i.redd.it/tdesry37x0o61.jpg"),
                             new SeasonData("Season 2", new Ability("Witch of Greed"), new Faction("Witches of Sin"), "https://i.redd.it/tdesry37x0o61.jpg")
                                            )
                                    ),
        new ReZeroCharacter("Satella",
                Arrays.asList(
                        new SeasonData("All", new Ability("Authority of Envy"), new Faction("Witch of Envy"), "https://tse2.mm.bing.net/th/id/OIP.zfdkiVXoGGPaxebi9TKEvAHaEK?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3"),
                        new SeasonData("Season 1", new Ability("Authority of Envy"), new Faction("Witch of Envy"), "https://tse2.mm.bing.net/th/id/OIP.zfdkiVXoGGPaxebi9TKEvAHaEK?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3"),
                        new SeasonData("Season 2", new Ability("Authority of Envy"), new Faction("Witch of Envy"), "https://tse2.mm.bing.net/th/id/OIP.zfdkiVXoGGPaxebi9TKEvAHaEK?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3")
                                            )
                                    ),

        new ReZeroCharacter("Frederica Baumann",
                Arrays.asList(
                        new SeasonData("All", new Ability("Beast Transformation"), new Faction("Roswaal Mansion"), "https://tse1.mm.bing.net/th/id/OIP.XdU42bFiTckUw8yuzUegggHaKe?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3"),
                        new SeasonData("Season 2", new Ability("Beast Transformation"), new Faction("Roswaal Mansion"), "https://tse1.mm.bing.net/th/id/OIP.XdU42bFiTckUw8yuzUegggHaKe?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3")
                                            )
                                    ),

            new ReZeroCharacter("Minerva",
                    Arrays.asList(
                            new SeasonData("All", new Ability("Healing Fist"), new Faction("Echidna's Garden"), "https://i.pinimg.com/736x/d3/a4/ee/d3a4ee01ed1d67d088944ae2ed149557.jpg"),
                            new SeasonData("Season 2", new Ability("Healing Fist"), new Faction("Echidna's Garden"), "https://i.pinimg.com/736x/d3/a4/ee/d3a4ee01ed1d67d088944ae2ed149557.jpg")
                    )
            ),

            new ReZeroCharacter("Typhon",
                    Arrays.asList(
                            new SeasonData("All", new Ability("Sin Judgment"), new Faction("Echidna's Garden"), "https://tse3.mm.bing.net/th/id/OIP.5dWehetdmTbyCJxZYYJj-QHaEK?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3"),
                            new SeasonData("Season 2", new Ability("Sin Judgment"), new Faction("Echidna's Garden"), "https://tse3.mm.bing.net/th/id/OIP.5dWehetdmTbyCJxZYYJj-QHaEK?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3")
                    )
            ),

            new ReZeroCharacter("Daphne",
                    Arrays.asList(
                            new SeasonData("All", new Ability("Creation of Mabeasts"), new Faction("Echidna's Garden"), "https://otakotaku.com/asset/img/character/2020/09/daphne-5f5e3e085e3b2p.jpg"),
                            new SeasonData("Season 2", new Ability("Creation of Mabeasts"), new Faction("Echidna's Garden"), "https://otakotaku.com/asset/img/character/2020/09/daphne-5f5e3e085e3b2p.jpg")
                    )
            ),

            new ReZeroCharacter("Sekhmet",
                    Arrays.asList(
                            new SeasonData("All", new Ability("Invisible Hand"), new Faction("Echidna's Garden"), "https://tse2.mm.bing.net/th/id/OIP.9zTvyDzkMqK61vn-IqeGzwHaIr?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3"),
                            new SeasonData("Season 2", new Ability("Invisible Hand"), new Faction("Echidna's Garden"), "https://tse2.mm.bing.net/th/id/OIP.9zTvyDzkMqK61vn-IqeGzwHaIr?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3")
                    )
            ),

            new ReZeroCharacter("Camilla",
                    Arrays.asList(
                            new SeasonData("All", new Ability("Charming Aura"), new Faction("Echidna's Garden"), "https://tse1.mm.bing.net/th/id/OIP.s_0KHg-a8j2LyeLgPopsHAHaEz?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3"),
                            new SeasonData("Season 2", new Ability("Charming Aura"), new Faction("Echidna's Garden"), "https://tse1.mm.bing.net/th/id/OIP.s_0KHg-a8j2LyeLgPopsHAHaEz?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3")
                    )
            ),
            new ReZeroCharacter("Pandora",
                    Arrays.asList(
                            new SeasonData("All", new Ability("Authority of Vanity"), new Faction("Echidna's Garden"), "https://tse2.mm.bing.net/th/id/OIP.Bx05KiBdN67PkC4yGBHGpgHaKm?cb=thvnext&w=618&h=885&rs=1&pid=ImgDetMain&o=7&rm=3"),
                            new SeasonData("Season 1", new Ability("Authority of Vanity"), new Faction("Echidna's Garden"), "https://tse2.mm.bing.net/th/id/OIP.Bx05KiBdN67PkC4yGBHGpgHaKm?cb=thvnext&w=618&h=885&rs=1&pid=ImgDetMain&o=7&rm=3"),
                            new SeasonData("Season 2", new Ability("Authority of Vanity"), new Faction("Echidna's Garden"), "https://tse2.mm.bing.net/th/id/OIP.Bx05KiBdN67PkC4yGBHGpgHaKm?cb=thvnext&w=618&h=885&rs=1&pid=ImgDetMain&o=7&rm=3")
                    )
            ),

            new ReZeroCharacter("Regulus Corneas",
                    Arrays.asList(
                            new SeasonData("All", new Ability("Authority of Greed"), new Faction("Witch Cult"), "https://tse1.mm.bing.net/th/id/OIP.QTJzqzLg4V4XskuuIB8RGQHaHa?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3"),
                            new SeasonData("Season 1", new Ability("Authority of Greed"), new Faction("Witch Cult"), "https://tse1.mm.bing.net/th/id/OIP.QTJzqzLg4V4XskuuIB8RGQHaHa?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3"),
                            new SeasonData("Season 2", new Ability("Authority of Greed"), new Faction("Witch Cult"), "https://tse1.mm.bing.net/th/id/OIP.QTJzqzLg4V4XskuuIB8RGQHaHa?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3")
                    )
            ),

            new ReZeroCharacter("Ley Batenkaitos",
                    Arrays.asList(
                            new SeasonData("All", new Ability("Authority of Gluttony"), new Faction("Witch Cult"), "https://tse3.mm.bing.net/th/id/OIP.Qy6Bmqnsgw5jZZQG83eB_gAAAA?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3"),
                            new SeasonData("Season 1", new Ability("Authority of Gluttony"), new Faction("Witch Cult"), "https://tse3.mm.bing.net/th/id/OIP.Qy6Bmqnsgw5jZZQG83eB_gAAAA?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3"),
                            new SeasonData("Season 2", new Ability("Authority of Gluttony"), new Faction("Witch Cult"), "https://tse3.mm.bing.net/th/id/OIP.Qy6Bmqnsgw5jZZQG83eB_gAAAA?cb=thvnext&rs=1&pid=ImgDetMain&o=7&rm=3")
                    )
            ),


            new ReZeroCharacter("Fortuna",
                    Arrays.asList(
                            new SeasonData("All", new Ability("Spirit Blessing"), new Faction("Echidna's Garden"), "https://i0.wp.com/sakusakutomato.com/wp-content/uploads/2021/02/43_28.jpg?ssl=1"),
                            new SeasonData("Season 2", new Ability("Spirit Blessing"), new Faction("Echidna's Garden"), "https://i0.wp.com/sakusakutomato.com/wp-content/uploads/2021/02/43_28.jpg?ssl=1")
                    )
            )
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
