package beans;

public class Usuario {
	private String usuario;
	private String senha;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		if (!usuario.equals(""))
			this.usuario = usuario;
		else
			new Exception("Nome do usuário não preenchido");
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		if (!senha.equals(""))
			this.senha = senha;
		else
			new Exception("Senha do usuário não preenchido");
	}

}
