package br.com.castgroup.escola.repository.professor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.castgroup.escola.entities.Professor;

@Repository
public interface IProfessorRepository extends JpaRepository<Professor, Integer> {

}
