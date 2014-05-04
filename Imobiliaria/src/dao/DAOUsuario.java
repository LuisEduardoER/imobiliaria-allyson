package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.util.ArrayList;
import java.util.List;

import jdbc.Conexao;
import beans.Usuario;


public class DAOUsuario {

	private Connection con;

	public DAOUsuario() {
		con =  new Conexao().getConnection();
	}
	
	public void cadastrar(Usuario u){
		
		String sql = "insert into usuario(usuario, senha) values (?,?)";
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
	public ArrayList<Usuario> buscarTodos(){
		
		ArrayList<Usuario> lista =  new ArrayList<Usuario>();
		String sql = "select * from usuario";
				
		try {
					PreparedStatement pstm = con.prepareStatement(sql);
					
					ResultSet res = pstm.executeQuery();
					
					while(res.next()){
						Usuario usuario =  new Usuario();
						usuario.setId(res.getInt("idusuario") );
						usuario.setUsuario(res.getString("usuario"));
						usuario.setSenha(res.getString("senha"));
						lista.add(usuario);
					}
					pstm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return lista;
	}
	
	public void alterar(Usuario usuario) { 

		String sql = "update usuario set usuario=? , senha=? where idusuario=?";

		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, usuario.getId());
			pstm.setString(2, usuario.getUsuario());
			pstm.setString(3, usuario.getSenha());
			
			
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(Usuario usuario) { 

		

		String sql = "delete from usuario where idusuario=?";

		

		try {
			PreparedStatement pstm = con.prepareStatement(sql);

			pstm.setInt(1, usuario.getId());
			
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Usuario autenticar(Usuario usuario){
				String sql = "select * from usuario where usuario=? and senha=?";
				
				try {
					PreparedStatement pstm = con.prepareStatement(sql);
					pstm.setString(1, usuario.getUsuario());
					pstm.setString(2, usuario.getSenha());
					
					ResultSet res = pstm.executeQuery();
					
					
					if(res.next()){
						
						Usuario usu =  new Usuario();
						usu.setId(res.getInt("idusuario") );
						usu.setUsuario(res.getString("usuario"));
						usu.setSenha(res.getString("senha"));
						return usu;
					}
					
					pstm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return null;
	}

	
}
