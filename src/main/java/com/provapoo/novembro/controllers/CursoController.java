package com.provapoo.novembro.controllers;

import com.provapoo.novembro.models.AlunoModel;
import com.provapoo.novembro.models.CursoModel;
import com.provapoo.novembro.services.AlunoService;
import com.provapoo.novembro.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @PostMapping
    public CursoModel criarCurso(@RequestBody CursoModel cursoModel){
        return cursoService.criarCurso(cursoModel);
    }

    @GetMapping
    public List<CursoModel> listarCurso(){
        return cursoService.listarCurso();
    }

    @GetMapping("/{id}")
    public CursoModel buscarCurso(@PathVariable Long id){
        return cursoService.buscarCurso(id);
    }

    @PutMapping("/{id}")
    public void atualizarCurso(@PathVariable Long id, @RequestBody CursoModel cursoModel){
        CursoModel curso = cursoService.buscarCurso(id);
        curso.setNome(cursoModel.getNome());
        curso.setAlunos(cursoModel.getAlunos());
        curso.setCargaHoraria(cursoModel.getCargaHoraria());
        cursoService.atualizarCurso(id, cursoModel);
    }

    @DeleteMapping("/{id}")
    public void deletarCurso(@PathVariable Long id){
        cursoService.deletarCurso(id);
    }
}