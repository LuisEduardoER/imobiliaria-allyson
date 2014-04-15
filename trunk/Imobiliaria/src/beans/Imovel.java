package beans;

public class Imovel {
	private String[] pretende; 
	private String tipo;
	private String estado;
	private String cidade;

	private int valvenda;
	private int vallocacao;

	
	
	public String[] getPretende() {
		return pretende;
	}

	public void setPretende(String[] pretende) {
		if(!pretende.equals("")&& pretende != null)
		this.pretende = pretende;
		else new Exception(" não preenchido");
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if(!cidade.equals("") && cidade !=null)
		this.cidade = cidade;
		else new Exception("cidade não preenchido");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if(!tipo.equals("") && tipo !=null)
		this.tipo = tipo;
		else new Exception("tipo não preenchido");
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if(!estado.equals("") && estado != null)
		this.estado = estado;
		else new Exception("estado não preenchido");
	}

	public int getValvenda() {
		return valvenda;
	}

	public void setValvenda(int valvenda) {
		this.valvenda = valvenda;
		
	}

	public int getVallocacao() {
		return vallocacao;
	}

	public void setVallocacao(int vallocacao) {
		this.vallocacao = vallocacao;
	}

}
