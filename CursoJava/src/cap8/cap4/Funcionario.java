package cap8.cap4;

import javax.swing.text.html.parser.Parser;

abstract public  class Funcionario {
	
	private String nome;
	private int idade;
	private boolean estadoCivil;
	private String endereco;
	private String telefone;
	private double salario;
	
	String getNome() {
		return nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(boolean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	abstract void reajustarSalario();
	
	
	public void setDados(String nome, int idade, String endereco, String telefone, double salario){
		setNome(nome);
		setIdade(idade);
		setEstadoCivil(estadoCivil);
		setEndereco(endereco);
		setTelefone(telefone);
		setSalario(salario);		
	}
	
	void mostrarDados() {
		System.out.println("Nome " + getNome());
		System.out.println("Idade " + getIdade());
		System.out.println("Salario " + getSalario());
	}


}
