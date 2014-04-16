package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import jdbc.Conexao;
import beans.Usuario;


public class DAOUsuario {

	
	
	public void cadastrar(Usuario u){
		Connection con = new Conexao().getConnection();
		String sql = "insert into usuario ( usuario, senha) values (?,?)";
		 try {
			    PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, u.getUsuario());
				pstmt.setString(2, u.getSenha());
				
				pstmt.execute();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 
	}
	
}
