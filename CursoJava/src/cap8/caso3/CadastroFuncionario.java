package cap8.caso3;

public class CadastroFuncionario {
	public static void main(String[] args) {
	
		Funcionario fun = new Funcionario();
		Secretaria sec = new Secretaria();
		Motorista mot = new Motorista();
		Programador pro = new Programador();
		
		//fun.setDados("nome", 24, "Endereco", "0909890", 35353);
		
		
		fun.mostrarDados();
		
		fun.setNome("Jos�");
		fun.setEstadoCivil(false);
		fun.setIdade(18);
		fun.setEndereco("Rua Sergipe");
		fun.setTelefone("3983098029");
		fun.setSalario(1800);
		fun.reajustarSalario();
		System.out.println("Nome " + fun.getNome());
		System.out.println("Idade " + fun.getIdade());
		System.out.println("Salario " + fun.getSalario());
		
		mot.setNome("Pedro");
		mot.setEstadoCivil(true);
		mot.setIdade(26);
		mot.setEndereco("Rua Aurora");
		mot.setTelefone("9890790");
		mot.setSalario(1300);
		mot.reajustarSalario();
		
		mot.mostrarDados();
		
		/*
		System.out.println("Nome " + mot.getNome());
		System.out.println("Idade " + mot.getIdade());
		System.out.println("Sal�rio: " + mot.getSalario());
		*/
		pro.setNome("Programador");
		pro.setEstadoCivil(true);
		pro.setIdade(28);
		pro.setEndereco("Rua teste");
		pro.setTelefone("000930890890");
		pro.setSalario(4000);
		pro.reajustarSalario();
		pro.setLinguage("PHP");
		/*
		System.out.println("Nome " + pro.getNome());
		System.out.println("idade:" + pro.getIdade());
		System.out.println("Salario " + pro.getSalario());
		*/
		pro.mostrarDados();
		
	}

}
