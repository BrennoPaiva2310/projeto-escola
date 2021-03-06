package br.com.castgroup.escola.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.castgroup.escola.dtos.AlunoDTO;
import br.com.castgroup.escola.dtos.ProfessorDTO;
import br.com.castgroup.escola.entities.Aluno;
import br.com.castgroup.escola.entities.Professor;
import br.com.castgroup.escola.service.ProfessorService;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
	
	@Autowired
	private ProfessorService service; //instanciando a service
	
	@GetMapping("/{id}")
	public ResponseEntity<Professor> findById(@PathVariable Integer id){
		Professor item = service.findById(id);
		return ResponseEntity.ok().body(item);
		
	}
	
	@GetMapping("/professores")
	public ResponseEntity<List<ProfessorDTO>> findAll(){
	List<Professor> list = service.findAll();
	List<ProfessorDTO> listDTO =  list.stream().map(obj -> new ProfessorDTO(obj)).collect(Collectors.toList());
	return ResponseEntity.ok().body(listDTO);
	}
	

}
