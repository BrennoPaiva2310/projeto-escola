package br.com.castgroup.escola.repository.curso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.castgroup.escola.entities.Curso;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Integer> {

}
