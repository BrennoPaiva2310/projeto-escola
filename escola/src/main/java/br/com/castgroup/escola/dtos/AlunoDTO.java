package br.com.castgroup.escola.dtos;

import java.io.Serializable;

import br.com.castgroup.escola.entities.Aluno;

public class AlunoDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private String endereco;
	
	public AlunoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	

	public AlunoDTO(Aluno obj) {
		super();
		this.id = obj.getIdAluno();
		this.nome = obj.getNome();
		this.endereco = obj.getEndereco();
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
