package cap8.cap4;

public class Programador extends Funcionario{
	String linguage;
	
	public void setDados(String nome, int idade, String endereco, String telefone, double salario){
		 setDados(nome, idade, endereco, telefone, salario);			
		 setLinguage(linguage);
	}
	public String getLinguage() {
		return linguage;
	}

	public void setLinguage(String linguage) {
		this.linguage = linguage;
	}
	
	public void reajustarSalario() {
		setSalario(getSalario() + 300);
		
	}
	
	void mostrarDados() {
		System.out.println("----------------");
		super.mostrarDados();
		System.out.println("Linguage " + getLinguage());
	}
	
}
