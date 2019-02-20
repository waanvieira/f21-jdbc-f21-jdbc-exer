package cap5;

public class Gato {
	String nome;
	String raca;
	int idade;
	boolean vacina;
	String alimentacao;
	//nome
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	//raca
	String getRaca() {
		return raca;
	}
	void setRaca(String raca) {
		this.raca = raca;
	}
	//idade
	int getIdade() {
		return idade;
	}
	void setIdade(int idade) {
		this.idade = idade;
	}
	//vacina
	boolean getVacina() {
		return vacina;
	}
	void setVacina(boolean vacina) {
		this.vacina = vacina;
	}
	
	String getAlimentacao() {
		return alimentacao;
	}
	
	void  setAlimentacao(int idade) {
		this.idade = idade;
		if(idade <=2) {
			alimentacao = "8 vezes ao dia";
			System.out.println("Alimentar" + alimentacao);
		}
		else if(idade <8) {
			alimentacao = "6 veze ao dia";
			System.out.println("Alimentar" + alimentacao);
		}
		else {
			alimentacao = " 3 vezes ao dia";
			System.out.println("Alimentar" + alimentacao);
		}
		
		
	}
	
	void exibeDados() {
		System.out.println("Nome" + getNome());
		System.out.println("Raca" + getRaca());
		System.out.println("Idade" + getIdade());
		System.out.println("Vacina" + getVacina());
	}
	
	void exibeVacin() {
		System.out.println("Alimentar em " + getAlimentacao());
	}
	
	
		
	
	
}
