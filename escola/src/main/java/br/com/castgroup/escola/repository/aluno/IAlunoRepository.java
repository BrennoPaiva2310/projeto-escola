package br.com.castgroup.escola.repository.aluno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.castgroup.escola.entities.Aluno;


@Repository
public interface IAlunoRepository extends JpaRepository<Aluno, Integer>{

}
