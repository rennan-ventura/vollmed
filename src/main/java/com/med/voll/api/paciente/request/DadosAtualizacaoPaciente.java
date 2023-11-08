package com.med.voll.api.paciente.request;

import com.med.voll.api.endereco.DadosEndereco;


public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
