package cap5;

public class UsaPessa {
	public static void main(String[] args) {
		int x = 10;
		String s = "Qualquer pessoa";
		
		int y;
		
		//toda variavel local deve ser instanciada antes de ser usada
	//	System.out.println(y);
	//p � uma variavel de referencia que vai guardar objeto pessoa	
		Pessoa p;
		
		//System.out.println(p);
		//Pessoa � uma classe de chamada para instanciar
		p = new Pessoa();
		System.out.println(p);
		System.out.println(p.nome);
		System.out.println(p.idade);
		System.out.println(p.estadoCivil);
		System.out.println(p.sexo);
		
		p.nome = "Nome teste";
		p.idade = 20;
		p.estadoCivil = true;
		p.sexo = 'M';
		System.out.println("Nome " + p.nome);
		
		Pessoa p2 = new Pessoa();
		 //p2.guardaNome(n);
		 
	
	}
	
}