package cap5;

public class Pessoa {
	String nome;
	int idade;
	char sexo;
	boolean estadoCivil;
	
	void guardaNome(String n){
	//nome = n;
	//boa pratica com this
	this.nome = nome;
	}
	
	String retornaNome(){
		return nome;
	}
	
	void guardaIdade(int i) {
		idade = i;
	}
	
	int retornaIdade() {
		return idade;
	}

}
