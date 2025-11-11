package com.provapoo.novembro.repositories;

import com.provapoo.novembro.models.CursoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<CursoModel,Long> {
}
