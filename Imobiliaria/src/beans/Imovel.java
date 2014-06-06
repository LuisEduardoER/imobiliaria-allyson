package beans;

import java.util.Arrays;

public class Imovel {
	private String[] pretende;
	private String tipo;
	private String estado;
	private String cidade;

	private int valvenda;
	private int vallocacao;
	private int idimovel;
	private int idusuario;
	private int pretendevender;
	private int pretendealugar;
	private Usuario usuario;
	
	
	
	@Override
	public String toString() {
		return "Imovel [pretende=" + Arrays.toString(pretende) + ", tipo="
				+ tipo + ", estado=" + estado + ", cidade=" + cidade
				+ ", valvenda=" + valvenda + ", vallocacao=" + vallocacao
				+ ", idimovel=" + idimovel + ", idusuario=" + idusuario
				+ ", pretendevender=" + pretendevender + ", pretendealugar="
				+ pretendealugar + ", usuario=" + usuario + "]";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String[] getPretende() {
		return pretende;
	}

	public void setPretende(String[] pretende) {
		this.pretende = pretende;
	}

	public int getPretendevender() {
		return pretendevender;
	}

	public void setPretendevender(int pretendevender) {
		this.pretendevender = pretendevender;
	}

	public int getPretendealugar() {
		return pretendealugar;
	}

	public void setPretendealugar(int pretendealugar) {
		this.pretendealugar = pretendealugar;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int getIdimovel() {
		return idimovel;
	}

	public void setIdimovel(int idimovel) {
		this.idimovel = idimovel;
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
