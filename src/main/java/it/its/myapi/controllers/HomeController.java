package it.its.myapi.controllers;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import it.its.myapi.di.Clash;
import it.its.myapi.di.UuidImpl;
import it.its.myapi.dto.UtenteDto;
import it.its.myapi.ibands.Animale;
import it.its.myapi.ibands.IBand;
import it.its.myapi.ibands.Uuid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class HomeController {
    @Autowired
    private IBand clash;

    @Autowired
    private IBand oasis;

    @Autowired
    private Animale gatto;

    @Autowired
    private Animale cane;

    @Autowired
    private Uuid uuidNonCasuale;

    @Autowired Uuid uuidImpl;

    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public UtenteDto getHome(){
        UtenteDto utenteDto = new UtenteDto();
        utenteDto.setName("Carlo");
        utenteDto.setSurname("Strozzi");
        clash.sing();
        oasis.sing();
        gatto.verso();
        cane.verso();
        return utenteDto;
    }

    @GetMapping(value = "/uuid", produces = MediaType.APPLICATION_JSON_VALUE)
    public void stampaUuid(){
        uuidImpl.creaUuid();
        uuidNonCasuale.creaUuid();
    }



}
