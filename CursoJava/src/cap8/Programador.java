package cap8;

public class Programador extends Funcionario{
	String linguage;
	
	public String getLinguage() {
		return linguage;
	}

	public void setLinguage(String linguage) {
		this.linguage = linguage;
	}
	
	public void reajustarSalario() {
		salario += 300;
		
	}
	
}
