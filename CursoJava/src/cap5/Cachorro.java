package cap5;

public class Cachorro {
	
	String nome;
	String raca;
	int idade;
	
	public String getNome() {
		return nome;		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public String getRaca() {
		return raca;		
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
		
	}
	
	public int getIdade() {
		return idade;		
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
		
	}
	
	
	
	void exibeCachorro() {
		System.out.println("Nome " + getNome());
		System.out.println("Raça " + getRaca());
		System.out.println("Idade " + getIdade());
	}
}
