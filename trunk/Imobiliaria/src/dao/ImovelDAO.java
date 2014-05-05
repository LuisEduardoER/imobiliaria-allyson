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
		
		String sql = "insert into imovel(pretende,tipo,estado,cidade,valvenda,vallocacao) values (?,?,?,?,?,?,?)";
		 try {
			    PreparedStatement pstmt = con.prepareStatement(sql);
			    ArrayList pretende =  new ArrayList(); 
			    
			    //String[] array = i.getPretende();
			    //for(String s:array.){
			    	
			    //}
				//pstmt.setArray(1, array);
			    pstmt.setString(2, i.getTipo());
				pstmt.setString(3, i.getEstado());
				pstmt.setString(4, i.getCidade());
			    pstmt.setInt(5, i.getValvenda());
			    pstmt.setInt(6, i.getVallocacao());
			    
			    
				pstmt.execute();
				pstmt.close();
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
					//i.setPretende(res.getString("pretende"));
					i.setCidade(res.getString("cidade"));
					i.setEstado(res.getString("estado"));
					i.setTipo(res.getString("tipo"));
					i.setVallocacao(res.getInt("vallocacao"));
					i.setValvenda(res.getInt("valvenda"));
					lista.add(i);
				}
				pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return lista;
}

public void alterar(Imovel i) { 

	String sql = "update imovel set pretende=? , cidade=? , estado=?,tipo=?,vallocacao=?,valvenda=? where idimovel=?";

	try {
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setInt(1, i.getIdimovel());
		//pstm.setString(2, i.getPretende());
		pstm.setString(3, i.getCidade());
		pstm.setString(4, i.getEstado());
		pstm.setString(5, i.getTipo());
		pstm.setInt(6, i.getVallocacao());
		pstm.setInt(7, i.getValvenda());
		
		
		pstm.execute();
		pstm.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

public void excluir(Imovel i) { 

	

	String sql = "delete from imovel where idimovel=?";

	

	try {
		PreparedStatement pstm = con.prepareStatement(sql);

		pstm.setInt(1, i.getIdimovel());
		
		pstm.execute();
		pstm.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
	
	
}