package commamd.imovel;

import java.io.IOException;

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
		HttpSession session = request.getSession();
		Usuario usuario = (Usuario)session.getAttribute("usuAutenticado");
		
		
		if(usuario != null){
			Imovel i = new Imovel();
			int id = Integer.parseInt(request.getParameter("id"));
			ImovelDAO idao = new ImovelDAO();
			 i = idao.buscarPorId(id);
			int x = usuario.getId();
			if(i.getIdusuario() == x){
			idao.excluir(i);
			request.getRequestDispatcher("pesquisaimovel.jsp").forward(request, response);
			
			}else request.getRequestDispatcher("naoexlui.html").forward(request, response);
		}request.getRequestDispatcher("naoexlui.html").forward(request, response);
	}

	
}