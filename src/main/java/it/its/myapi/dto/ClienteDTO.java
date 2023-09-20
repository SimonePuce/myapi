package it.its.myapi.dto;

public class ClienteDTO {
    public int clienteID;
    public String nomeCliente;
    public String cognomeCliente;

    public ClienteDTO(int clienteID, String nomeCliente, String cognomeCliente) {
        this.clienteID = clienteID;
        this.nomeCliente = nomeCliente;
        this.cognomeCliente = cognomeCliente;
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCognomeCliente() {
        return cognomeCliente;
    }

    public void setCognomeCliente(String cognomeCliente) {
        this.cognomeCliente = cognomeCliente;
    }
}
