package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectioFactory {
	public Connection getConnection() {
		try {
			//registradno a o driver
			//Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbF21", "postgres", "postgres");
		}catch (Exception e) {
			throw new RuntimeException("Erro: " + e);
			// TODO: handle exception
		}
	}
}
