package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Usuario;
import dao.DAOUsuario;


@WebServlet("/ServletListaUsuario")
public class ServletListaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletListaUsuario() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DAOUsuario usu = new DAOUsuario();
		
		
		ArrayList<Usuario> lista = usu.buscarTodos();
		HttpSession session = request.getSession();
		session.setAttribute("lista", lista);
		
		request.getRequestDispatcher("pesquisausu.jsp").forward(request, response);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
