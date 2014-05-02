package command;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Usuario;


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
		
		if(u.getUsuario() !=null){
			
			HttpSession sessao = request.getSession();
			
			sessao.setAttribute("usuario", u);
			
			request.getRequestDispatcher("inicio.html").forward(request, response);
			
		}else{request.getRequestDispatcher("index.html").forward(request, response);}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
