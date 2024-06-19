package br.com.barbearia.controller;

import br.com.barbearia.model.Agendamento;

import java.util.ArrayList;

public class AgendamentoController {

// Aqui estou criando uma lista para agendamento
    private ArrayList<Agendamento> agendametos = new ArrayList<>();

    public void agendar(Agendamento agendamento) {
        agendametos.add(agendamento);
    }

    public ArrayList<Agendamento> consultarAgendamentos() {
        return agendametos;
    }

    public void cancelarAgendamento(int id) {
        agendametos.removeIf(ag -> ag.getId() == id);
    }
}
