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
@Table(name = "tb_professor")
public class Professor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProfessor;
	
	@Column(name = "nome", length = 150, nullable = false)
	private String nome;
	
	@Column(name = "endereco", nullable = false)
	private String endereco;
	

	//Relacionamento
	@OneToMany(mappedBy = "professor")
	private List<Turma> turma = new ArrayList<>();
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public Professor(Integer idProfessor, String nome, String endereco) {
		super();
		this.idProfessor = idProfessor;
		this.nome = nome;
		this.endereco = endereco;
	}

	public Integer getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
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
		return Objects.hash(idProfessor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return Objects.equals(idProfessor, other.idProfessor);
	}

	
	
	
	
	
	
}
