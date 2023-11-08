package com.med.voll.api.controller;

import com.med.voll.api.paciente.request.DadosAtualizacaoPaciente;
import com.med.voll.api.paciente.request.DadosCadastroPaciente;
import com.med.voll.api.paciente.response.DadosListagemPaciente;
import com.med.voll.api.paciente.Paciente;
import com.med.voll.api.paciente.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @GetMapping
    public Page<DadosListagemPaciente> listagem(@PageableDefault(page = 0, size = 10, sort = {"nome"}) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }
    @PostMapping
    @Transactional
    public void cadastro(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPaciente dados) {
        var paciente = repository.getReferenceById(dados.id());
        paciente.atualizarInformacoes(dados);

    }

}
