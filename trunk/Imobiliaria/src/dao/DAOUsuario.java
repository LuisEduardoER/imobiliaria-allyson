package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.Conexao;
import beans.Usuario;


public class DAOUsuario {

	Connection conn = new Conexao().getConnection();
	
	public void cadastrar(Usuario u){
		String sql = "insert into usuario ( usuario, senha) values (?,?)";
		 try {
			    PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, u.getUsuario());
				pstmt.setString(2, u.getSenha());
				
				pstmt.executeUpdate();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 
	}
	
}
