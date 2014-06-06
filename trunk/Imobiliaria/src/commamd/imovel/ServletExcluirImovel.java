package commamd.imovel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Imovel;
import beans.Usuario;
import dao.ImovelDAO;


@WebServlet("/ServletExcluirImovel")
public class ServletExcluirImovel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletExcluirImovel() {
        super();
       
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		HttpSession session = request.getSession();
		Usuario usuario = (Usuario)session.getAttribute("usuAutenticado");
		
		int r = 0;
		
		Imovel i = new Imovel();
		int id = Integer.parseInt(request.getParameter("id"));
		i.setIdimovel(id);

		
		ImovelDAO idao = new ImovelDAO();
		r = idao.excluir(i);
		
		
		if(r == 1){
			System.out.println(r);
			rd = request.getRequestDispatcher("inicio.jsp");
			rd.forward(request, response);
		}else{
			rd = request.getRequestDispatcher("naoexclui.html");
			rd.forward(request, response);
		}
	}

	
}
