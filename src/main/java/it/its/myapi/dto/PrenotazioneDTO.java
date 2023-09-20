package it.its.myapi.dto;

import java.util.ArrayList;
import java.util.List;

public class PrenotazioneDTO {
    public int prenotazioneID;
    public String dataInizio;
    public String dataFine;
    public List<AttrezzatureDTO> attrezzature;
    public ClienteDTO cliente;



    public int getPrenotazioneID() {
        return prenotazioneID;
    }

    public void setPrenotazioneID(int prenotazioneID) {
        this.prenotazioneID = prenotazioneID;
    }

    public String getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(String dataInizio) {
        this.dataInizio = dataInizio;
    }

    public String getDataFine() {
        return dataFine;
    }

    public void setDataFine(String dataFine) {
        this.dataFine = dataFine;
    }

    public List<AttrezzatureDTO> getAttrezzature() {
        return attrezzature;
    }

    public void setAttrezzature(List<AttrezzatureDTO> attrezzature) {
        this.attrezzature = attrezzature;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }
}
