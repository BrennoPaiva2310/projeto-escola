package br.com.castgroup.escola.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAluno;
	
	
	@Column(name = "nome", length = 150, nullable = false)
	private String nome;

	@Column(name = "endereco", nullable = false)
	private String endereco;
	
	
	//Relacionamento
	@OneToMany(mappedBy = "aluno")
	private List<Turma> turma = new ArrayList<>();
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(Integer idAluno, String nome, String endereco) {
		super();
		this.idAluno = idAluno;
		this.nome = nome;
		this.endereco = endereco;
		
	}

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Turma> getTurma() {
		return turma;
	}

	public void setTurma(List<Turma> turma) {
		this.turma = turma;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAluno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(idAluno, other.idAluno);
	}
	
	
	
	
	
	









}
