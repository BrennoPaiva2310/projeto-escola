package br.com.castgroup.escola.repository.turma;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.castgroup.escola.entities.Turma;

@Repository
public interface ITurmaRepository extends JpaRepository<Turma, Integer> {

}
