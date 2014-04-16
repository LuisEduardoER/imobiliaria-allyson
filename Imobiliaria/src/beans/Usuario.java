package beans;

public class Usuario {
	private String usuario;
	private String senha;
	private Integer id;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		if (!usuario.equals("") && usuario != null)
			this.usuario = usuario;
		else
			new Exception("Nome do usuário não preenchido");
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		if (!senha.equals("") && senha != null)
			this.senha = senha;
		else
			new Exception("Senha do usuário não preenchido");
	}

}
