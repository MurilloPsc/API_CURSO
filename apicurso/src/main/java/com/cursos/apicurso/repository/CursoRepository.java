package com.cursos.apicurso.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cursos.apicurso.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Id>{

	Curso findById(int id);
	
}
