package commamd.imovel;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Imovel;

@WebServlet("/ServletCadastraImovel")
public class ServletCadastraImovel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletCadastraImovel() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String venda = request.getParameter("venda");
		String aluga = request.getParameter("locacao");
		
		Imovel i = new Imovel();
		/*if(venda!=null){
			i.setPretende(venda);
		}
		if(aluga!=null){
			i.setPretende(aluga);
		}*/
		
		i.setTipo(request.getParameter("tipo"));
		i.setEstado(request.getParameter("estado"));
		i.setCidade(request.getParameter("cidade"));
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
