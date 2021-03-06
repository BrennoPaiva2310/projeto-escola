package br.com.castgroup.escola.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_turma")
public class Turma implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTurma;

	@Column(name = "semestre", length = 10, nullable = false)
	private Integer semestre;

	@Column(name = "ano", nullable = false)
	private Integer ano;

	// Relacionamento
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "aluno_id")
	private Aluno aluno;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "curso_id")
	private Curso curso;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "professor_id")
	private Professor professor;
	
	public Turma() {
		// TODO Auto-generated constructor stub
	}
	

	public Turma(Integer idTurma, Integer semestre, Integer ano, Aluno aluno, Curso curso, Professor professor) {
		super();
		this.idTurma = idTurma;
		this.semestre = semestre;
		this.ano = ano;
		this.aluno = aluno;
		this.curso = curso;
		this.professor = professor;
	}
	


	public Integer getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(Integer idTurma) {
		this.idTurma = idTurma;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTurma);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		return Objects.equals(idTurma, other.idTurma);
	}

}
