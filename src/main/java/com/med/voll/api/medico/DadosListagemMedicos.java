package com.med.voll.api.medico;

public record DadosListagemMedicos(
        Long id,
        String nome,
        String email,
        String crm,
        EspecialidadeEnum especialidade) {

    public DadosListagemMedicos(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
