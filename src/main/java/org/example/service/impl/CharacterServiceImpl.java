package org.example.service.impl;
import lombok.extern.slf4j.Slf4j;
import org.example.service.service.CharacterService;
import org.example.service.model.Marvelresponse;
import org.example.service.service.MarvelClientFeign;
import org.springframework.stereotype.Service;
@Service
@Slf4j
public class CharacterServiceImpl implements CharacterService {
    private final MarvelClientFeign marvelClientFeign;

    public CharacterServiceImpl(MarvelClientFeign marvelClientFeign) {
        this.marvelClientFeign = marvelClientFeign;
    }

    @Override
    public Marvelresponse getCharacter() {
        log.info("On getcharacter of library");
        return marvelClientFeign.getCharacter("42ca8a580f3b3aecb8dc76908194aadd", "ffb95b015edfee9eace3d747d21deb79");
    }

    /**
     * Metodo para obtener characters por id.
     *
     * @param marvelRequest para buscar por parametro
     * @return Marvelresponse
     */
    @Override
    public Marvelresponse getCharacterById(String marvelRequest) {
        log.info("On getCharacterById of library");
        return marvelClientFeign.getCharacterById(marvelRequest, "42ca8a580f3b3aecb8dc76908194aadd", "ffb95b015edfee9eace3d747d21deb79");
    }
}