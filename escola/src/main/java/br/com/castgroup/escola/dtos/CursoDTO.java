package br.com.castgroup.escola.dtos;

import java.io.Serializable;

import br.com.castgroup.escola.entities.Curso;

public class CursoDTO implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Integer idCurso;
	private String nome;
	private String sigla;
	
	public CursoDTO() {
		// TODO Auto-generated constructor stub
	}

	public CursoDTO(Curso obj) {
		super();
		this.idCurso = obj.getIdCurso();
		this.nome = obj.getNome();
		this.sigla = obj.getSigla();
	}

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	



}
