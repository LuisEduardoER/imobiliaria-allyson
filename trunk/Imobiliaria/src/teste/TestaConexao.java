package teste;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import beans.Usuario;
import jdbc.Conexao;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {
		Connection con = new Conexao().getConnection();
		String sql = "select * from usuario";
		Statement stmt;
		ArrayList<Usuario> listUsuario = null;
		
		try {
			Usuario e = null;
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			listUsuario = new ArrayList<Usuario>();
			
			while(rs.next()){
				e = new Usuario();
				System.out.println(rs.getString("usuario"));
				
				e = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		con.close();
		}
}
