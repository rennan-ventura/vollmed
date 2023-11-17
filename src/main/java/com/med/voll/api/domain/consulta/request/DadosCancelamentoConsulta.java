package com.med.voll.api.domain.consulta.request;

import com.med.voll.api.domain.consulta.MotivoCancelamentoEnum;
import jakarta.validation.constraints.NotNull;

public record DadosCancelamentoConsulta(
        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamentoEnum motivo
) {
}
