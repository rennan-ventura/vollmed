package com.med.voll.api.medico.request;

import com.med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
