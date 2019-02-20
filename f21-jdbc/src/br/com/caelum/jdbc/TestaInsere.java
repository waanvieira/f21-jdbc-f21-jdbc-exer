package br.com.caelum.jdbc;

import java.sql.SQLException;
import java.util.Calendar;

import DAO.ContatoDao;

public class TestaInsere {

	public static void main(String[] args) throws SQLException {	
	Contato contato = new Contato();
	
	// pronto para gravar
	contato.setNome(" Caelum");
	contato.setEmail("contato@caelum.com.br");
	contato.setEndereco("R. Vergueiro 3185 cj57");
	contato.setDataNascimento("20/02/2019");
		    
	//grave nessa conexao
	ContatoDao dao = new ContatoDao();
	//metodo elegante cadastra elegante
	//o m�todo esta sendo instanciado dentro da class
	dao.cadastra(contato);
	
	System.out.println("Contato gravado com sucesso" + contato.getNome());	    		
		

	}

}
