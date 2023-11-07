package com.med.voll.api.controller;

import com.med.voll.api.endereco.Endereco;
import com.med.voll.api.medico.DadosCadastroMedico;
import com.med.voll.api.medico.DadosListagemMedicos;
import com.med.voll.api.medico.Medico;
import com.med.voll.api.medico.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @GetMapping
    public List<DadosListagemMedicos> listar() {
        return repository.findAll().stream().map(DadosListagemMedicos::new).toList();
    }

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
        repository.save(new Medico(dados));
    }
}
