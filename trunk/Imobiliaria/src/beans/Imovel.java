package beans;

public class Imovel {
	private boolean alugar;
	private boolean vender;
	private String tipo;
	private String estado;
	private String cidade;

	private int valvenda;
	private int vallocacao;

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public boolean isAlugar() {
		return alugar;
	}

	public void setAlugar(boolean alugar) {
		this.alugar = alugar;
	}

	public boolean isVender() {
		return vender;
	}

	public void setVender(boolean vender) {
		this.vender = vender;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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
