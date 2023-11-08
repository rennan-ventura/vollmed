package com.med.voll.api.paciente.response;

import com.med.voll.api.paciente.Paciente;

public record DadosListagemPaciente(
        String nome,
        String email,
        String cpf) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
