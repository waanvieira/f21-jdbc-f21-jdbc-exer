package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	public Connection getConexao() {
		try {
			//Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection("jdbc:postgres:http//localhost:5432/tbUsuarios", "postgres", "postgres");
			
		}catch(Exception erro){
			throw new RuntimeException("Erro: " + erro);
			
		}		
	}
}
