package com.med.voll.api.domain.medico.request;

import com.med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
