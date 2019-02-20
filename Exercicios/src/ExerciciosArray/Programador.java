package ExerciciosArray;

public class Programador {
	
	private String nome;
	private String linguagem;
	private double salario;
	
	Programador(){
		
	}
	
	Programador(String nome, String linguagem, double salario){
		setNome(nome);
		setLinguagem(linguagem);
		setSalario(salario);		
	}

	// NOME
	void setNome(String nome) {
		this.nome = nome;
	}

	String getNome() {
		return nome;
	}

	// linguagem
	void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	String getLinguagem() {
		return linguagem;
	}

	// salario
	void setSalario(double salario) {
		this.salario = salario;
	}

	double getSalario() {
		return salario;
	}
	
		void exibeProgramador() {
			System.out.println("Nome: " + getNome());
			System.out.println("LInguagem: " + getLinguagem());
			System.out.println("Sal�rio: " + getSalario());
			System.out.println("---------------------------------");
		}
}
