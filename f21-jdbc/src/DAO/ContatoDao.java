package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.Contato;

public class ContatoDao {
	
	//conexao com o banco	
	public Connection connection;
	
	public ContatoDao() {
		this.connection = new ConnectioFactory().getConnection();
	}	
	
	public void cadastra(Contato contato) {		
		String sql ="INSERT INTO tbcontatos " + "(nome, email, endereco, datanascimento)"
					+ "VALUES(?, ?, ?, ?)";		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());					
			DateFormat dateFormat = new SimpleDateFormat("20/02/2019");
			java.util.Date minhaData = dateFormat.parse(contato.getDataNascimento());
			stmt.setString(4, contato.getDataNascimento());
			//stmt.setDate(4, new java.sql.Date(minhaData.getTime()); 
			
			//stmt.setDate(4, new java.sql.Date(contato.getDataNascimento());
			//executa a query
			stmt.execute();
			//fecha a sql do banco
			stmt.close();
			
		}catch (Exception e) {
			throw new RuntimeException("Erro" + e);
			// TODO: handle exception
		}		
	}
	
	public List<Contato> getLista() {
        try {
            List<Contato> contatos = new ArrayList<Contato>();
            PreparedStatement stmt = this.connection.
            prepareStatement("select * from tbcontatos");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // criando o objeto Contato
                Contato contato = new Contato();
                contato.setId(rs.getLong("id"));
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contato.setEndereco(rs.getString("endereco"));

                // montando a data atrav�s do Calendar
                //Calendar data = Calendar.getInstance();
                //data.setTime(rs.getDate("datanascimento"));
                //contato.setDataNascimento(data);

                // adicionando o objeto � lista
                contatos.add(contato);
            }
            rs.close();
            stmt.close();
            return contatos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
	
	public void atualiza(Contato contato) {		
		String sql ="UPDATE tbcontatos SET nome=?, email=?, endereco=? WHERE id=?";		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setLong(4, contato.getId());
			//executa a query
			stmt.execute();
			//fecha a sql do banco
			stmt.close();
			
			System.out.println("Dado alterado com sucesso");
			
		}catch (Exception e) {
			throw new RuntimeException("Erro" + e);
			// TODO: handle exception
		}		
	}
	
	public void deleta(Contato contato) {		
		String sql ="DELETE FROM tbcontatos WHERE id=?";		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, contato.getId());		
			//executa a query
			stmt.execute();
			//fecha a sql do banco
			stmt.close();			
			System.out.println("Dado alterado com sucesso");
			
		}catch (Exception e) {
			throw new RuntimeException("Erro" + e);
		}		
	}
	
}
