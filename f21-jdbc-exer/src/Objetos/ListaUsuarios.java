package Objetos;

import java.util.ArrayList;
import java.util.List;

import DAO.Crud;

public class ListaUsuarios {
	public static void main(String[] args) {
		//instancia a classe crud que tem o nosso objeto lista
		Crud cr = new Crud();
		//chama o método lista
		List<Usuario> usu = cr.getList();
		//for incremental para mostrar a lista
		for(Usuario usuario: usu) {
			System.out.println("ID: " + usuario.getId());
			System.out.println("NOme: " + usuario.getUsuario());
			System.out.println("Senha: " + usuario.getSenha());			
			
		}
		
		
	}
}
