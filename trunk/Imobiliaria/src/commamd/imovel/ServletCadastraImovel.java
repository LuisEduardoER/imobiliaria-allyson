package commamd.imovel;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.*;

@WebServlet("/ServletCadastraImovel")
public class ServletCadastraImovel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletCadastraImovel() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Usuario usuario = (Usuario)session.getAttribute("usuAutenticado");
		
		if(usuario != null){
		Imovel i = new Imovel();
		i.setCidade(request.getParameter("cidade"));
		i.setTipo(request.getParameter("tipo"));
		i.setEstado(request.getParameter("estado"));
		
		int loca = Integer.parseInt(request.getParameter("vallocacao"));
		int venda = Integer.parseInt(request.getParameter("valvenda"));
		
		i.setVallocacao(loca);
		i.setValvenda(venda);
		String[] pretende = request.getParameterValues("prentede");
		i.setPretende(pretende);
		
		
		
		}
		
	}

	

}
