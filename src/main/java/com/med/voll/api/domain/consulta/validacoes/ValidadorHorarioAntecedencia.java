package com.med.voll.api.domain.consulta.validacoes;

import com.med.voll.api.domain.ValidacaoException;
import com.med.voll.api.domain.consulta.request.DadosAgendamentoConsulta;

import java.time.Duration;
import java.time.LocalDateTime;

public class ValidadorHorarioAntecedencia {
    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();
        var agora = LocalDateTime.now();
        var diferençaEmMinutos = Duration.between(agora, dataConsulta).toMinutes();

        if(diferençaEmMinutos < 30) {
            throw new ValidacaoException("Consulta deve ser agendada com antecedência mínima de 30 minutos");
        }
    }
}
