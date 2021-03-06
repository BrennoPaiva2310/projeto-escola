package br.com.castgroup.escola.controllers;


import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.castgroup.escola.dtos.AlunoDTO;
import br.com.castgroup.escola.entities.Aluno;
import br.com.castgroup.escola.service.AlunoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {
	@Autowired
	private AlunoService service; //instanciando a service
	
	@GetMapping("/{id}")
	public ResponseEntity<Aluno> findById(@PathVariable Integer id){
		Aluno item = service.findById(id);
		return ResponseEntity.ok().body(item);
		
	}
	

	@GetMapping("/alunos")
	public ResponseEntity<List<AlunoDTO>> findAll(){
	List<Aluno> list = service.findAll();
	List<AlunoDTO> listDTO =  list.stream().map(obj -> new AlunoDTO(obj)).collect(Collectors.toList());
	return ResponseEntity.ok().body(listDTO);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody AlunoDTO objDto){
		Aluno obj = service.fromDTO(objDto);
		obj=service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdAluno()).toUri();
		return ResponseEntity.created(uri).build();
	}
	

}
