package command;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Usuario;
import dao.DAOUsuario;

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ServletLogin() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter s = response.getWriter();
		
		Usuario u = new Usuario();
		u.setUsuario(request.getParameter("usuario"));
		u.setSenha(request.getParameter("senha"));
		
		
			DAOUsuario usu = new DAOUsuario();
			
			Usuario usuAutenticado = usu.autenticar(u);
			
				if(usuAutenticado != null){
				HttpSession sessao = request.getSession();
			
				sessao.setAttribute("usuAutenticado",usuAutenticado );
			
				request.getRequestDispatcher("inicio.jsp").forward(request, response);
				
				}else{request.getRequestDispatcher("errologin.html").forward(request, response);}
			
			
	}

}
