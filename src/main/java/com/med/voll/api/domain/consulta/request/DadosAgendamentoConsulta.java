package com.med.voll.api.domain.consulta.request;

import com.med.voll.api.domain.medico.EspecialidadeEnum;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;


public record DadosAgendamentoConsulta(
        @NotNull
        Long idMedico,

        @NotNull
        Long idPaciente,

        @NotNull
        @Future
        LocalDateTime data,

        EspecialidadeEnum especialidade) {
}
