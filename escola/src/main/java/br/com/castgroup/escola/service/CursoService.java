package br.com.castgroup.escola.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.castgroup.escola.entities.Curso;
import br.com.castgroup.escola.repository.curso.ICursoRepository;

@Service
public class CursoService {
	@Autowired
	private ICursoRepository repository;
	
	//Metodo que faz a busca do meu aluno pelo ID
	public Curso findById(Integer id) {
		Optional<Curso> item = repository.findById(id);
		return item.orElse(null);
	}
	
	public List<Curso>findAll() {
		return repository.findAll();
	}
	


}
