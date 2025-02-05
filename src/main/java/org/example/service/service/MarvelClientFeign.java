package org.example.service.service;

import org.example.service.model.Marvelresponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "marvelClientFeign", url = "http://gateway.marvel.com/v1/public/characters") // This is CRUCIAL
public interface MarvelClientFeign {
    @GetMapping(value = "?ts=500",
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Marvelresponse getCharacterById(@RequestParam("id") String id,
                                    @RequestParam("apikey") String apikey,
                                    @RequestParam("hash") String hash);

    @GetMapping(value = "?ts=500",
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Marvelresponse getCharacter(@RequestParam("apikey") String apikey,
                                @RequestParam("hash") String hash);
}
