package DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	Connection conexao = new ConnectioFactory().getConnection();
	System.out.println("Conexao aberta");
	conexao.close();
	
	}

}