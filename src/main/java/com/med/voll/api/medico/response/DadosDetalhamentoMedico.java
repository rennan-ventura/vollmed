package com.med.voll.api.medico.response;

import com.med.voll.api.endereco.Endereco;
import com.med.voll.api.medico.EspecialidadeEnum;
import com.med.voll.api.medico.Medico;

public record DadosDetalhamentoMedico(
        Long id,
        String nome,
        String email,
        String crm,
        String telefone,
        EspecialidadeEnum especialidade,
        Endereco endereco) {

    public DadosDetalhamentoMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
