package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	static Connection con = null;
	
	public Connection getConnection() {
		String url ="jdbc:mysql://localhost:3306/imobiliaria";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	public static boolean closeConnection(){
		boolean fechou = false;
		try {
			con.close();
			fechou = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fechou;
	}
}

