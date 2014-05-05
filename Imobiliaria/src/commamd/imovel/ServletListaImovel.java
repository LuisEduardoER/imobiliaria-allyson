package commamd.imovel;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Imovel;
import dao.ImovelDAO;


@WebServlet("/ServletListaImovel")
public class ServletListaImovel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletListaImovel() {
        super();
       
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ImovelDAO id = new ImovelDAO();
		
		ArrayList<Imovel> lista = id.buscarTodos();
		HttpSession session = request.getSession();
		session.setAttribute("lista", lista);
		
		request.getRequestDispatcher("pesquisaimovel.jsp").forward(request, response);
		
	}

	

}
