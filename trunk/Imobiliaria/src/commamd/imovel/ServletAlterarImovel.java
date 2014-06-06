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
		
		
		
		//<input id="iid" type="hidden" name="iid" value="<%=imovel.getIdimovel()%>" readonly="readonly">
		
		Imovel imovel = new Imovel();
		
		
		int id = Integer.parseInt(request.getParameter("id"));
			
				imovel.setIdimovel(id);		
			 //imovel = idao.buscarPorId(id);
			 System.out.println(imovel.getIdimovel());
			 
			 HttpSession sessao = request.getSession();
			 sessao.setAttribute("imovel",imovel );
			
			
			
			request.getRequestDispatcher("alteraimovel.jsp").forward(request, response);
			
			
		
	}

}
