package br.com.castgroup.escola.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.castgroup.escola.entities.Aluno;
import br.com.castgroup.escola.entities.Curso;
import br.com.castgroup.escola.entities.Professor;
import br.com.castgroup.escola.entities.Turma;
import br.com.castgroup.escola.repository.aluno.IAlunoRepository;
import br.com.castgroup.escola.repository.curso.ICursoRepository;
import br.com.castgroup.escola.repository.professor.IProfessorRepository;
import br.com.castgroup.escola.repository.turma.ITurmaRepository;

public class DBService {
	@Autowired
	private IAlunoRepository alunoRepository;
	@Autowired
	private ICursoRepository cursoRepository;
	@Autowired
	private IProfessorRepository professorRepository;
	@Autowired
	private ITurmaRepository turmaRepository;
	public void instanciaBaseDeDados() {

		
		
		Aluno a1 = new Aluno(null,"Brenno", "Rua São Geraldo 17");
		Curso c1 = new Curso(null,"matematica","mat");
		Professor p1 = new Professor(null,"Paulo Andre", "rua antonio silva");
		Turma t1 = new Turma(null,2,2020,a1,c1,p1);
		
		a1.getTurma().addAll(Arrays.asList(t1));
		c1.getTurma().addAll(Arrays.asList(t1));
		p1.getTurma().addAll(Arrays.asList(t1));
		
		this.alunoRepository.saveAll(Arrays.asList(a1));
		this.cursoRepository.saveAll(Arrays.asList(c1));
		this.professorRepository.saveAll(Arrays.asList(p1));
		this.alunoRepository.saveAll(Arrays.asList(a1));
		this.turmaRepository.saveAll(Arrays.asList(t1));
		
}


}