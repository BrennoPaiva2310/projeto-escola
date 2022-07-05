package br.com.castgroup.escola.request.login;

public class LoginAlunoPostRequest {

	private String login;
	private String senha;

	public LoginAlunoPostRequest() {
		// TODO Auto-generated constructor stub
	}

	public LoginAlunoPostRequest(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
