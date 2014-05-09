package teste;

import beans.Imovel;
import dao.ImovelDAO;

public class TestaImovelDAO {

	public static void main(String[] args) {
		testCadastrar();
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
}
