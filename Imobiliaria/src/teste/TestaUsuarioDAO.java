package teste;

import java.util.ArrayList;

import beans.Usuario;
import dao.DAOUsuario;

public class TestaUsuarioDAO {

	public static void main(String[] args) {
		testCadastrar();
	}
	private static void testCadastrar() {
		//instancia que será um registro no banco
		Usuario usuario1 =  new Usuario();
		usuario1.setSenha("890");
		usuario1.setUsuario("jos");
		
		//instancia que será um registro no banco
		Usuario usuario2 =  new Usuario();
		usuario2.setSenha("898");
		usuario2.setUsuario("ana");
		
		//instancia do objeto que faz o CRUD
		DAOUsuario usuarioDAO=  new DAOUsuario();
		
		//usuarioDAO.cadastrar(usuario1);
		//ArrayList<Usuario> lista = usuarioDAO.buscarTodos();
		 
		//for (Usuario l: lista){
		//System.out.println(l.getUsuario());	
		//}
		Usuario x = usuarioDAO.autenticar(usuario1);
		if(x != null){
		System.out.println("ok");
		}else{System.out.println("tofu");}
		}
	}


