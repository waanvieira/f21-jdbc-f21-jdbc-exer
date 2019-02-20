package dao;

import model.Usuario;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import org.apache.jasper.tagplugins.jstl.core.Catch;

import jdk.nashorn.internal.ir.SetSplitState;

public class UsuarioDAO {
	private Connection conn;
	private PreparedStatement stmt;
	private java.sql.Statement st;
	private ResultSet rs;
	private ArrayList<Usuario> lista = new ArrayList<>(); 
	
	public UsuarioDAO() {
		 conn = new Conexao().getConexao();	
	}
		
	public void inserir(Usuario usuario) {
		String sql="INSRT INTO tbUsuarios (id, nome, senha) values(?,?,?)";		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, usuario.getId());
			stmt.setString(2, usuario.getNome());
			stmt.setString(3, usuario.getSenha());	
			
			stmt.execute();
			stmt.close();
			
		}catch (Exception e) {
			System.out.println("Conexao falhou erro " );			
			// TODO: handle exception
		}		
	}
	
	public void alterar(Usuario usuario) {
		String sql="UPATE tbUsuarios SET nome = ? WHERE nome =?";
		try {
			
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, usuario.getId());
			stmt.setString(2, usuario.getNome());
			stmt.setString(3, usuario.getNome());	
			
			stmt.execute();
			stmt.close();
			
		}catch (Exception e) {
			System.out.println("Conexao falhou erro " );			
			// TODO: handle exception
		}
		
	}
	
	public void excluir(int id) {
		String sql="DELETE FROM tbUsuarios WHERE id= "+ id;
		try {
			st = conn.createStatement();				
			st.execute(sql);
			st.close();
			
		}catch (Exception e) {
			System.out.println("Conexao falhou erro " );			
			// TODO: handle exception
		}		
	}
	
	public ArrayList<Usuario> listarTodos(){
		String sql = "SELECT * FROM tbUsuarios";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				Usuario usu = new Usuario();
				usu.setId(rs.getInt("id"));
				usu.setNome(rs.getString("nome"));
				usu.setSenha(rs.getString("senha"));
				lista.add(usu);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return lista;
	}
	
}
