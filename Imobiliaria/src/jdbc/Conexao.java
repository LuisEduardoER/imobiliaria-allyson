package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	static Connection conn = null;
	
	public Connection getConnection() {
		String url ="jdbc:mysql://localhost:3306/imobiliaria";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, "root", "root");
			System.out.println("conectou");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	public static boolean closeConnection(){
		boolean fechou = false;
		try {
			conn.close();
			fechou = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fechou;
	}
}

