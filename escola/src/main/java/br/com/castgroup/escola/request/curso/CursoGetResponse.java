package br.com.castgroup.escola.request.curso;


public class CursoGetResponse {

	private Integer idCurso;

	private String nome;

	private String sigla;

	public CursoGetResponse() {
		// TODO Auto-generated constructor stub
	}

	public CursoGetResponse(Integer idCurso, String nome, String sigla) {
		super();
		this.idCurso = idCurso;
		this.nome = nome;
		this.sigla = sigla;
	}

	public Integer getCurso() {
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

}
