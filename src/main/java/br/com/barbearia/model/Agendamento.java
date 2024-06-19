package br.com.barbearia.model;

public class Agendamento {

    private int id;
    private int idCliente;
    private int idServico;
    private String data;
    private String hora;

    public Agendamento (int id, int idCliente, int idServico, String data, String hora){
        this.id = id;
        this.idCliente = idCliente;
        this.idServico = idServico;
        this.data = data;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
