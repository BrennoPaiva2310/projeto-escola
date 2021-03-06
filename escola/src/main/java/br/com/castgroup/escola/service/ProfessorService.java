package br.com.castgroup.escola.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.castgroup.escola.entities.Professor;
import br.com.castgroup.escola.repository.professor.IProfessorRepository;

@Service//Para mexer com minha regra de negocio
public class ProfessorService {
	@Autowired
	private IProfessorRepository repository;
	
	//Metodo que faz a busca do meu aluno pelo ID
	public Professor findById(Integer id) {
		Optional<Professor> item = repository.findById(id);
		return item.orElse(null);
	}
	
	public List<Professor>findAll() {
		return repository.findAll();
	}


}
