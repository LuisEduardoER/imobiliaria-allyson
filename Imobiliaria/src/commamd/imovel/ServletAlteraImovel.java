package commamd.imovel;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ImovelDAO;
import beans.Imovel;


@WebServlet("/ServletAlteraImovel")
public class ServletAlteraImovel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ServletAlteraImovel() {
        super();
      
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("iid"));
		
		Imovel i = new Imovel();
		i.setIdimovel(id);
		i.setCidade(request.getParameter("cidade"));
		i.setTipo(request.getParameter("tipo"));
		i.setEstado(request.getParameter("estado"));
		int loca = Integer.parseInt(request.getParameter("vallocacao"));
		int venda = Integer.parseInt(request.getParameter("valvenda"));
		
		i.setVallocacao(loca);
		i.setValvenda(venda);
		
		String[] p = request.getParameterValues("pretende");
		i.setPretende(p);
		if(p != null){
		}
		i.setPretendevender(0);
		i.setPretendealugar(0);
		for (int x = 0; x < p.length; x++) {
			String lista;
			lista =p[x];
			System.out.println(lista);
		if(p[x].equals("vender")){
			i.setPretendevender(1);
		}
		if(p[x].equals("alugar")){
			i.setPretendealugar(1);
		}
		}
		i.toString();
		ImovelDAO idao = new ImovelDAO();
		idao.alterar(i);
		
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
	}

}
