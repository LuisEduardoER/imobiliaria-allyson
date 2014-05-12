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


@WebServlet("/ServletAlterarImovel")
public class ServletAlterarImovel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ServletAlterarImovel() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Usuario usuario = (Usuario)session.getAttribute("usuAutenticado");
		
		int x = usuario.getId();
		String id = request.getParameter("id");
		Imovel i = new Imovel();
		ImovelDAO idao = new ImovelDAO();
		
		if(id!=null){
			
						
			 i = idao.buscarPorId(Integer.parseInt(id));
			if(i.getIdusuario() == x){ 
			request.setAttribute("i", i);
			
			//encaminhar para o frmcadusuario
			request.getRequestDispatcher("pesquisaimovel.jsp").forward(request, response);
			
			}else request.getRequestDispatcher("naoexlui.html").forward(request, response);
		
		}request.getRequestDispatcher("naoexlui.html").forward(request, response);
	}

}
