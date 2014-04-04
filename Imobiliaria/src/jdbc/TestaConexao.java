package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.Conexao;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
	Connection connection = new Conexao().getConnection();
	
	connection.close();

	}

}
