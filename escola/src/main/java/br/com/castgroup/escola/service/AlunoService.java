package br.com.castgroup.escola.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.castgroup.escola.dtos.AlunoDTO;
import br.com.castgroup.escola.entities.Aluno;
import br.com.castgroup.escola.repository.aluno.IAlunoRepository;

@Service//Para mexer com minha regra de negocio
public class AlunoService {
	
	@Autowired
	private IAlunoRepository repository;
	
	//Metodo que faz a busca do meu aluno pelo ID
	public Aluno findById(Integer id) {
		Optional<Aluno> item = repository.findById(id);
		return item.orElse(null);
	}
	
	public List<Aluno>findAll() {
		return repository.findAll();
	}
	
	
	public Aluno insert(Aluno obj) {
		return repository.save(obj);
	}
	
	public Aluno fromDTO(AlunoDTO objDto) {
		return new Aluno(objDto.getId(), objDto.getNome(), objDto.getEndereco());
	}
}
