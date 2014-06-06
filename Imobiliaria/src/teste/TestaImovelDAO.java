package teste;

import beans.Imovel;
import dao.ImovelDAO;

public class TestaImovelDAO {

	public static void main(String[] args) {
		
		procurar();
		
	}
	private static void testCadastrar() {
		Imovel i = new Imovel();
		String lista[] = new String[2];
		lista[0] = "xx";
		lista[1] = "yy";
		
		i.setCidade("fortaleza");
		i.setEstado("ce");
		i.setIdusuario(50);
		
		i.setPretendealugar(1);
		i.setPretendevender(0);
		i.setTipo("casa");
		i.setVallocacao(100);
		i.setValvenda(200);
		ImovelDAO idao= new ImovelDAO();
		idao.cadastrar(i);
		System.out.println("done");
		
	}
	private static void procurar(){
		ImovelDAO idao= new ImovelDAO();
		
		
		
		Imovel i = new Imovel();
		i.setCidade("horizonte");
		i.setEstado("ce");
		i.setIdimovel(2);
		i.setPretendealugar(1);
		i.setPretendevender(0);
		i.setTipo("apartamento");
		i.setVallocacao(250);
		i.setValvenda(80000);
		
		idao.alterar(i);
	}
}
