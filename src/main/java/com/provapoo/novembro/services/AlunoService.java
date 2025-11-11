package com.provapoo.novembro.services;

import com.provapoo.novembro.models.AlunoModel;
import com.provapoo.novembro.models.CursoModel;
import com.provapoo.novembro.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public AlunoModel criarAluno(AlunoModel alunoModel){
        return alunoRepository.save(alunoModel);
    }
    public List<AlunoModel> listarAlunos(){
        return alunoRepository.findAll();
    }
    public AlunoModel buscarAluno(Long id){
        return alunoRepository.findById(id).get();
    }
    public AlunoModel atualizarAluno(Long id, AlunoModel alunoModel){
        return alunoRepository.save(alunoModel);
    }
    public void deletarAluno(Long id){
        alunoRepository.deleteById(id);
    }
}
