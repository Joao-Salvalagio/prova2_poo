package com.provapoo.novembro.repositories;

import com.provapoo.novembro.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel,Long> {
}
