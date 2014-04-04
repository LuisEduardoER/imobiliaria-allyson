package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Imovel;

@WebServlet("/ServletCadastro")
public class ServletCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletCadastro() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String venda = request.getParameter("venda");
		String aluga = request.getParameter("locacao");
		
		Imovel i = new Imovel();
		if(venda!=null){
			i.setVender(true);
		}
		if(aluga!=null){
			i.setAlugar(true);
		}
		
		i.setTipo(request.getParameter("tipo"));
		i.setEstado(request.getParameter("estado"));
		i.setCidade(request.getParameter("cidade"));
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
