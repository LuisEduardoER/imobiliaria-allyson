package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import jdbc.Conexao;
import beans.Imovel;



public class ImovelDAO {
	private Connection con;

	public ImovelDAO() {
		con =  new Conexao().getConnection();
	}
	
	
public void cadastrar(Imovel i){
		
		String sql = "insert into imovel(idiusuario,pretendelocar,pretendevender,tipo,estado,cidade,valvenda,vallocacao) values (?,?,?,?,?,?,?,?)";
		 try {
			    PreparedStatement pstmt = con.prepareStatement(sql);
			    
			    
			    
				pstmt.setInt(1, i.getIdusuario());
			    pstmt.setInt(2, i.getPretendealugar());
				pstmt.setInt(3, i.getPretendevender());
				pstmt.setString(4, i.getTipo());
				pstmt.setString(5, i.getEstado());
				pstmt.setString(6, i.getCidade());
			    pstmt.setInt(7, i.getValvenda());
			    pstmt.setInt(8, i.getVallocacao());
			    
			    
				pstmt.execute();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

public ArrayList<Imovel> buscarTodos(){
	
	ArrayList<Imovel> lista =  new ArrayList<Imovel>();
	String sql = "select * from imovel";
			
	try {
				PreparedStatement pstm = con.prepareStatement(sql);
				
				ResultSet res = pstm.executeQuery();
				
				while(res.next()){
					Imovel i =  new Imovel();
					i.setIdimovel(res.getInt("idimovel"));
					//i.setIdusuario(res.getInt("idiusuario"));
					i.setCidade(res.getString("cidade"));
					i.setEstado(res.getString("estado"));
					i.setTipo(res.getString("tipo"));
					//i.setVallocacao(res.getInt("vallocacao"));
					i.setValvenda(res.getInt("valvenda"));
					lista.add(i);
				}
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return lista;
}

public void alterar(Imovel i) { 

	String sql = "update imovel set pretendelocar=?,pretendevender=?,tipo=?,estado=?,cidade=?,valvenda=?,vallocacao=? where idimovel=?";

	try {
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setInt(1, i.getPretendealugar());
		pstm.setInt(2, i.getPretendevender());
		pstm.setString(3, i.getTipo());
		pstm.setString(4, i.getEstado());
		pstm.setString(5, i.getCidade());
		pstm.setInt(6, i.getVallocacao());
		pstm.setInt(7, i.getValvenda());
		pstm.setInt(8, i.getIdimovel());
		
		
		pstm.execute();
		pstm.close();
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

public int excluir(Imovel i) { 



	String sql = "delete from imovel where idimovel=?";
	int resultado = 0;
	

	try {
		PreparedStatement pstm = con.prepareStatement(sql);

		pstm.setInt(1, i.getIdimovel());
		
		resultado = pstm.executeUpdate();
		pstm.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return resultado;
}

public Imovel buscarPorId(int id){
	
			String sql = "select * from imovel where id=?";
			
			try {
				PreparedStatement pstm = con.prepareStatement(sql);
				pstm.setInt(1, id);
				
				ResultSet res = pstm.executeQuery();
				
				
				if(res.next()){
					
					Imovel i =  new Imovel();
					i.setIdimovel(res.getInt("idimovel"));
					//i.setIdusuario(res.getInt("idiusuario"));
					i.setCidade(res.getString("cidade"));
					i.setEstado(res.getString("estado"));
					i.setTipo(res.getString("tipo"));
					//i.setVallocacao(res.getInt("vallocacao"));
					i.setValvenda(res.getInt("valvenda"));
					i.setIdusuario(res.getInt("idiusuario"));
					System.out.println("retornoi");
					return i;
				}
				
				pstm.close();
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return null;
}
	
	
}
