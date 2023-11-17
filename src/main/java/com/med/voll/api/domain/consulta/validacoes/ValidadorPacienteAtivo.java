package com.med.voll.api.domain.consulta.validacoes;

import com.med.voll.api.domain.ValidacaoException;
import com.med.voll.api.domain.consulta.request.DadosAgendamentoConsulta;
import com.med.voll.api.domain.paciente.PacienteRepository;

public class ValidadorPacienteAtivo {

    private PacienteRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        if(dados.idPaciente() == null){
            return;
        }

        var pacienteEstaAtivo = repository.findAtivoById(dados.idPaciente());
        if(!pacienteEstaAtivo){
            throw new ValidacaoException("Consulta não pode ser agendada com paciente inativo");
        }
    }

}
