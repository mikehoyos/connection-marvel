package org.example.service.service;

import org.example.service.model.Marvelresponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CharacterService {
    /**
     * Metodo para obtener characters
     * @return Marvelresponse
     */
    Marvelresponse getCharacter();

    /**
     * Metodo para obtener characters por id.
     * @param marvelRequest para buscar por parametro
     * @return Marvelresponse
     */
    Marvelresponse getCharacterById(String marvelRequest);
}
