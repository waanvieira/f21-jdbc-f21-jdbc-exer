package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
		
public class ConnectionFactory {
	private final String DB = "dbF21";
	private final String USER = "postgres";
	private final String SENHA = "postgres";
	private final String conect = "";
	
	public Connection getConnection() {
	
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + DB, USER, SENHA);			
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}