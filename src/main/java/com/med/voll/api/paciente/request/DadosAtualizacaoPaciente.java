package com.med.voll.api.paciente.request;

import com.med.voll.api.endereco.DadosEndereco;
import jakarta.validation.Valid;


public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid
        DadosEndereco endereco) {
}
