package Objetos;

import DAO.Crud;

public class ExcluiUsuario {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario usu = new Usuario();
		usu.setId(1);;
		usu.setUsuario("Usu 1");
		usu.setSenha("senha 2");
		
		Crud cr = new Crud();
		
		cr.exlcuiUsuario(usu);

	}

}
