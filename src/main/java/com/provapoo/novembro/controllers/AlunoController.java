package com.provapoo.novembro.controllers;

import com.provapoo.novembro.models.AlunoModel;
import com.provapoo.novembro.repositories.AlunoRepository;
import com.provapoo.novembro.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public AlunoModel criarAluno(@RequestBody AlunoModel alunoModel){
        return alunoService.criarAluno(alunoModel);
    }

    @GetMapping
    public List<AlunoModel> listarAlunos(){
        return alunoService.listarAlunos();
    }

    @GetMapping("/{id}")
    public AlunoModel buscarAluno(@PathVariable Long id){
        return alunoService.buscarAluno(id);
    }

    @PutMapping("/{id}")
    public void atualizarAluno(@PathVariable Long id, @RequestBody AlunoModel alunoModel){
        AlunoModel aluno =  alunoService.atualizarAluno(id, alunoModel);
        aluno.setNome(alunoModel.getNome());
        aluno.setCurso(alunoModel.getCurso());
        aluno.setStatus(alunoModel.getStatus());
        aluno.setMatricula(alunoModel.getMatricula());
        alunoService.atualizarAluno(id, alunoModel);
    }

    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Long id){
        alunoService.deletarAluno(id);
    }
}
