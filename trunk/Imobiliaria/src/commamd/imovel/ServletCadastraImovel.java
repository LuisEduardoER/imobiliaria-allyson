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

@WebServlet("/ServletCadastraImovel")
public class ServletCadastraImovel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletCadastraImovel() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Usuario usuario = (Usuario)session.getAttribute("usuAutenticado");
		Imovel i = new Imovel();
		// <input id="txtid" type="hidden" name="txtid" value="<%=usuAutenticado.getId()%>" readonly="readonly">
		if(usuario != null){
		
		i.setIdusuario(usuario.getId());
		i.setCidade(request.getParameter("cidade"));
		i.setTipo(request.getParameter("tipo"));
		i.setEstado(request.getParameter("estado"));
		System.out.println(i.getCidade());
		System.out.println(i.getEstado());
		System.out.println("idusuario "+i.getIdusuario());
		int loca = Integer.parseInt(request.getParameter("vallocacao"));
		int venda = Integer.parseInt(request.getParameter("valvenda"));
		
		i.setVallocacao(loca);
		i.setValvenda(venda);
		
		String[] p = request.getParameterValues("prentede");
		System.out.println(i.getVallocacao());
		System.out.println(i.getValvenda());
		i.setPretende(p);
		if(p != null){
			System.out.println("naonulo");
		}System.out.println("nulo");
		/*for (int x = 0; x < p.length; x++) {
			String lista;
			lista =p[x];
			System.out.println(lista);
		if(p[x].equals("vender")){
			i.setPretendevender(1);
		}else{i.setPretendevender(0);}
		if(p[x].equals("alugar")){
			i.setPretendealugar(1);
		}else{i.setPretendealugar(0);}}
		*/
		ImovelDAO idao = new ImovelDAO();
		idao.cadastrar(i);
		
		request.getRequestDispatcher("cadastroimovel.jsp").forward(request, response);
		
		}else{request.getRequestDispatcher("errologin.html").forward(request, response);}
		
	}

	

}
