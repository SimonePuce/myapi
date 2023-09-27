package it.its.myapi.controllers;

import it.its.myapi.dto.AlunniDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/alunni")
public class AlunniController {

    @GetMapping(value = "/getAlunni", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AlunniDTO> getAlunni() {
        List<AlunniDTO> alunni = new ArrayList<>();
        alunni.add(new AlunniDTO("Altavilla","Antonio","https://github.com/alemarra89/its2224/blob/main/alunni/altavilla.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Avventuroso","Samuele","https://github.com/alemarra89/its2224/blob/main/alunni/avventuroso.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Basile","Chiara","https://github.com/alemarra89/its2224/blob/main/alunni/basile.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Corianò","Antonio","https://github.com/alemarra89/its2224/blob/main/alunni/coriano.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Cuccinelli","Dario","https://github.com/alemarra89/its2224/blob/main/alunni/cuccinelli.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Dongiovanni","Emanuele","https://github.com/alemarra89/its2224/blob/main/alunni/dongiovanni.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Ferrara","Edoardo","https://github.com/alemarra89/its2224/blob/main/alunni/ferrara.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Fiore","Renato","https://github.com/alemarra89/its2224/blob/main/alunni/fiore.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Fumarola","Francesco","https://github.com/alemarra89/its2224/blob/main/alunni/fumarola.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Gaetani","Lorenzo","https://github.com/alemarra89/its2224/blob/main/alunni/gaetani.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Laporta","Eliana","https://github.com/alemarra89/its2224/blob/main/alunni/laporta.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Lopalco","Gioele","https://github.com/alemarra89/its2224/blob/main/alunni/lopalco.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Masiello","Michelangelo","https://github.com/alemarra89/its2224/blob/main/alunni/masiello.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Pedio","Luigi","https://github.com/alemarra89/its2224/blob/main/alunni/pedio.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Puce","Simone","https://github.com/alemarra89/its2224/blob/main/alunni/puce.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Resta","Christian","https://github.com/alemarra89/its2224/blob/main/alunni/resta.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Riotti","Matteo","https://github.com/alemarra89/its2224/blob/main/alunni/riotti.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Sicuro","Eugenio","https://github.com/alemarra89/its2224/blob/main/alunni/sicuro.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Tondo","Gianluca","https://github.com/alemarra89/its2224/blob/main/alunni/tondo.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Tramis","Stefano","https://github.com/alemarra89/its2224/blob/main/alunni/tramis.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Verdesca","Narcis","https://github.com/alemarra89/its2224/blob/main/alunni/verdesca.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Vergine","Fabio","https://github.com/alemarra89/its2224/blob/main/alunni/vergine.jpeg?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Vitto","Carlo","https://github.com/alemarra89/its2224/blob/main/alunni/vitto.png?raw=true","https://www.links-srl.it/"));
        alunni.add(new AlunniDTO("Zagà","Rocco","https://github.com/alemarra89/its2224/blob/main/alunni/zaga.jpeg?raw=true","https://www.links-srl.it/"));
        return alunni;
    }

}
