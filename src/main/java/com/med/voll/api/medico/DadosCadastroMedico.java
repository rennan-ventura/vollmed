package com.med.voll.api.medico;

import com.med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        String nome,
        String email,
        String crm,
        EspecialidadeEnum especialidade,
        DadosEndereco endereco) {
}
