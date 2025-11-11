package com.provapoo.novembro.services;

import com.provapoo.novembro.models.CursoModel;
import com.provapoo.novembro.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public CursoModel criarCurso(CursoModel cursoModel){
        return cursoRepository.save(cursoModel);
    }

    public List<CursoModel> listarCurso(){
        return cursoRepository.findAll();
    }

    public CursoModel buscarCurso(Long id){
        return cursoRepository.findById(id).get();
    }

    public CursoModel atualizarCurso(Long id, CursoModel cursoModel){
        return cursoRepository.save(cursoModel);
    }

    public void deletarCurso(Long id){
        cursoRepository.deleteById(id);
    }
}
