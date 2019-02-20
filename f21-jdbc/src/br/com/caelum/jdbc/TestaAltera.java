package br.com.caelum.jdbc;

import java.sql.SQLException;
import java.util.Calendar;

import DAO.ContatoDao;

public class TestaAltera {
	public static void main(String[] args) throws SQLException {	
	Contato contato = new Contato();
	
	// pronto para gravar
	contato.setId(2);
	contato.setNome(" Caelum alterado 2 ");
	contato.setEmail("contato@caelum.com.br alterado2");
	contato.setEndereco("R. Vergueiro 3185 cj57 alterado");
	//contato.setDataNascimento(Calendar.getInstance());
		    
	//grave nessa conexao
	ContatoDao dao = new ContatoDao();
	//metodo elegante cadastra elegante
	//o método esta sendo instanciado dentro da class
	dao.atualiza(contato);
	
	System.out.println("Contato atualizado com sucesso" + contato.getNome());	    		
		

	}

}
