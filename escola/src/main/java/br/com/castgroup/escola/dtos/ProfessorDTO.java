package br.com.castgroup.escola.dtos;

import java.io.Serializable;

import br.com.castgroup.escola.entities.Professor;

public class ProfessorDTO implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Integer idProfessor;
	private String nome;
	private String endereco;
	
	public ProfessorDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProfessorDTO(Professor obj) {
		super();
		this.idProfessor = obj.getIdProfessor();
		this.nome = obj.getNome();
		this.endereco = obj.getEndereco();
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
	
	
	

}
