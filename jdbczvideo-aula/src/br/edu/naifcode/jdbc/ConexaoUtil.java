package br.edu.naifcode.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil {
		
	private static ConexaoUtil conexaoUtil;
	
	public static ConexaoUtil getInstance() {
		if(conexaoUtil == null) {
			conexaoUtil = new ConexaoUtil();			
		}
		return conexaoUtil;
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		//Class.forName("com.mysql.jdc.Driver");
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection("jdbc:postgres:http//localhost:5432/tbUsuarios", "postgres", "postgres");
		
	}
	
	public static void main(String[] args) {
		try {
					
			System.out.println(getInstance().getConnection());
			}		
		catch(Exception e){
				e.printStackTrace();
			}
		
	}
	
	
}
