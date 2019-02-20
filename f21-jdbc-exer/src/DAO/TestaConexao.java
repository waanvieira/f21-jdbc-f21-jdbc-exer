package DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		// Estabelecendo conexao com o BD	
		Connection conecta = new ConnectionFactory().getConnection();
		System.out.println("Conexao estabelecida");
		conecta.close();		

	}

}
