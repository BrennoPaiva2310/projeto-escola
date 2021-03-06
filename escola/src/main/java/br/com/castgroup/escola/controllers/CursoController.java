package br.com.castgroup.escola.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.castgroup.escola.dtos.CursoDTO;
import br.com.castgroup.escola.entities.Curso;
import br.com.castgroup.escola.service.CursoService;
@RestController
@RequestMapping("/curso")
public class CursoController {
	@Autowired
	private CursoService service; //instanciando a service
	
	@GetMapping("/{id}")
	public ResponseEntity<Curso> findById(@PathVariable Integer id){
		Curso item = service.findById(id);
		return ResponseEntity.ok().body(item);

}
	@GetMapping("/cursos")
	public ResponseEntity<List<CursoDTO>> findAll(){
	List<Curso> list = service.findAll();
	List<CursoDTO> listDTO =  list.stream().map(obj -> new CursoDTO(obj)).collect(Collectors.toList());
	return ResponseEntity.ok().body(listDTO);
	}
}