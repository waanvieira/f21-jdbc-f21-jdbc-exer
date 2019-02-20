package Objetos;

import DAO.Crud;
import Objetos.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario usu = new Usuario();
		usu.setUsuario("Usu 1");
		usu.setSenha("senha 2");
		
		Crud cr = new Crud();
		
		cr.cadastroUsuario(usu);

	}

}
