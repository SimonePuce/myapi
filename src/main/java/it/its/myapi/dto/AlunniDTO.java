package it.its.myapi.dto;

public class AlunniDTO {
    private String cognome;
    private String nome;
    private String immagine;
    private String azienda;

    public AlunniDTO(String cognome, String nome, String immagine, String azienda) {
        this.cognome = cognome;
        this.nome = nome;
        this.immagine = immagine;
        this.azienda = azienda;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImmagine() {
        return immagine;
    }

    public void setImmagine(String immagine) {
        this.immagine = immagine;
    }

    public String getAzienda() {
        return azienda;
    }

    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }
}
