package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Usuario;
import dao.DAOUsuario;

@WebServlet("/ServletCadastro")
public class ServletCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletCadastro() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario u = new Usuario();
		u.setSenha(request.getParameter("senha"));
		u.setUsuario(request.getParameter("usuario"));
		
		
		if(u.getUsuario() !=null){
			
			HttpSession sessao = request.getSession();
			
			sessao.setAttribute("usuario", u);
			DAOUsuario usu = new DAOUsuario();
			usu.cadastrar(u);
			request.getRequestDispatcher("inicio.html").forward(request, response);
			
		}else{request.getRequestDispatcher("cadastrousu.jsp").forward(request, response);}
	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
	}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
