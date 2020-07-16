package com.cursos.apicurso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursos.apicurso.repository.CursoRepository;
import com.cursos.apicurso.models.Curso;;

@RestController
@RequestMapping(value="/api")
public class CursoResource {

	@Autowired 
	CursoRepository cursoRepository;
	
	@GetMapping("/cursos")
	public List<Curso> listaCursos(){
		return cursoRepository.findAll();
	}
	
	@GetMapping("/curso/{id}")
	public Curso listaCursoUnico(@PathVariable(value="id") int id){
		return cursoRepository.findById(id);
	}
	
	@PostMapping("/curso")
	public Curso salvaCurso(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
	}
	
	@DeleteMapping("/curso")
	public void deletaCurso(@RequestBody Curso curso) {
		cursoRepository.delete(curso);
	}
	
	@PutMapping("/curso")
	public Curso atualizaProduto(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
	}
}
