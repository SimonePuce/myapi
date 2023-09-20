package it.its.myapi.dto;

public class AttrezzatureDTO {
    public int attrezzaturaID;
    public double costoAttrezzatura;
    public String tipoAttrezzatura;

    public int getAttrezzaturaID() {
        return attrezzaturaID;
    }

    public void setAttrezzaturaID(int attrezzaturaID) {
        this.attrezzaturaID = attrezzaturaID;
    }

    public double getCostoAttrezzatura() {
        return costoAttrezzatura;
    }

    public void setCostoAttrezzatura(double costoAttrezzatura) {
        this.costoAttrezzatura = costoAttrezzatura;
    }

    public String getTipoAttrezzatura() {
        return tipoAttrezzatura;
    }

    public void setTipoAttrezzatura(String tipoAttrezzatura) {
        this.tipoAttrezzatura = tipoAttrezzatura;
    }
}
