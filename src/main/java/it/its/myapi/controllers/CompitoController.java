package it.its.myapi.controllers;

import it.its.myapi.dto.AttrezzatureDTO;
import it.its.myapi.dto.ClienteDTO;
import it.its.myapi.dto.PrenotazioneDTO;
import it.its.myapi.dto.UtenteDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/prenotazioni")
public class CompitoController {

    @GetMapping(value = "/attrezzature", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AttrezzatureDTO> getAttrezzature(){
        AttrezzatureDTO attrezzaturaDTO1 = new AttrezzatureDTO();
        AttrezzatureDTO attrezzaturaDTO2 = new AttrezzatureDTO();
        attrezzaturaDTO1.setAttrezzaturaID(1);
        attrezzaturaDTO1.setCostoAttrezzatura(20);
        attrezzaturaDTO1.setTipoAttrezzatura("ombrellone");
        attrezzaturaDTO2.setAttrezzaturaID(2);
        attrezzaturaDTO2.setCostoAttrezzatura(30.5);
        attrezzaturaDTO2.setTipoAttrezzatura("cabina");
        List<AttrezzatureDTO> attrezzature = new ArrayList<>();
        attrezzature.add(attrezzaturaDTO1);
        attrezzature.add(attrezzaturaDTO2);
        return attrezzature;
    }
    @GetMapping(value = "/prenotati", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PrenotazioneDTO> prenotazioni(){
        PrenotazioneDTO prenotazioneDTO1 = new PrenotazioneDTO();
        PrenotazioneDTO prenotazioneDTO2 = new PrenotazioneDTO();
        prenotazioneDTO1.setPrenotazioneID(1);
        prenotazioneDTO1.setDataInizio("1 agosto");
        prenotazioneDTO1.setDataFine("3 agosto");
        prenotazioneDTO1.setCliente(new ClienteDTO(1, "simone", "puce"));
        prenotazioneDTO1.setAttrezzature(getAttrezzature());

        prenotazioneDTO2.setPrenotazioneID(2);
        prenotazioneDTO2.setDataInizio("5 agosto");
        prenotazioneDTO2.setDataFine("8 agosto");
        prenotazioneDTO2.setCliente(new ClienteDTO(2, "carlo", "vitto"));
        prenotazioneDTO2.setAttrezzature(getAttrezzature());

        List<PrenotazioneDTO> prenotazioniList = new ArrayList<>();
        prenotazioniList.add(prenotazioneDTO1);
        prenotazioniList.add(prenotazioneDTO2);
        return prenotazioniList;

    }

    @GetMapping(value = "/disponibili", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AttrezzatureDTO> attrezzatureDisponibili(@RequestParam(name = "dataInizio") String dataInizio,@RequestParam(name = "dataFine") String dataFine){
        List<PrenotazioneDTO> listaTempPrenotazione = prenotazioni();
        List<AttrezzatureDTO> listaTempAttrezzature = getAllAttrezzature();
        List<Integer> ids = new ArrayList<>();
        int conta;
        List<AttrezzatureDTO> daRitornare = new ArrayList<>();
        for (int i=0; i<listaTempPrenotazione.size();i++) {
            if(listaTempPrenotazione.get(i).getDataInizio().equalsIgnoreCase(dataInizio)){
                ids.add(listaTempPrenotazione.get(i).prenotazioneID);
            }
        }
        for(conta=0; conta<ids.size();conta++){
            int finalConta = conta;
            daRitornare = listaTempAttrezzature.stream().filter(a -> a.getAttrezzaturaID()==ids.get(finalConta)).toList();
        }

        return daRitornare;
    }

    public List<AttrezzatureDTO> getAllAttrezzature(){
        AttrezzatureDTO attrezzaturaDTO1 = new AttrezzatureDTO();
        AttrezzatureDTO attrezzaturaDTO2 = new AttrezzatureDTO();
        AttrezzatureDTO attrezzaturaDTO3 = new AttrezzatureDTO();
        AttrezzatureDTO attrezzaturaDTO4 = new AttrezzatureDTO();
        attrezzaturaDTO1.setAttrezzaturaID(1);
        attrezzaturaDTO1.setCostoAttrezzatura(20);
        attrezzaturaDTO1.setTipoAttrezzatura("ombrellone");
        attrezzaturaDTO2.setAttrezzaturaID(2);
        attrezzaturaDTO2.setCostoAttrezzatura(30.5);
        attrezzaturaDTO2.setTipoAttrezzatura("cabina");
        attrezzaturaDTO3.setAttrezzaturaID(3);
        attrezzaturaDTO3.setCostoAttrezzatura(30.5);
        attrezzaturaDTO3.setTipoAttrezzatura("lettino");
        attrezzaturaDTO4.setAttrezzaturaID(4);
        attrezzaturaDTO4.setCostoAttrezzatura(30.5);
        attrezzaturaDTO4.setTipoAttrezzatura("lettino");
        List<AttrezzatureDTO> attrezzature = new ArrayList<>();
        attrezzature.add(attrezzaturaDTO1);
        attrezzature.add(attrezzaturaDTO2);
        attrezzature.add(attrezzaturaDTO3);
        attrezzature.add(attrezzaturaDTO4);

        return attrezzature;
    }

}
