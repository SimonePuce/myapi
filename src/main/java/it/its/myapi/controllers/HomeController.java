package it.its.myapi.controllers;

import it.its.myapi.di.Clash;
import it.its.myapi.dto.UtenteDto;
import it.its.myapi.ibands.IBand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class HomeController {
    @Autowired
    private IBand band;

    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public UtenteDto getHome(){
        UtenteDto utenteDto = new UtenteDto();
        utenteDto.setName("Carlo");
        utenteDto.setSurname("Strozzi");
        band.sing();
        return utenteDto;
    }


}
