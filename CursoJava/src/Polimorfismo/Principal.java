package Polimorfismo;

public class Principal {
	public static void main(String[] args) {
		Transporte t = new Transporte();
		Veiculo v = new Veiculo();
		Carro c = new Carro();
		System.out.println("Passando transporte");
		moverTransporte(t);
		System.out.println("Passando veiculo");
		moverTransporte(v);
		System.out.println("Passando carro");
		moverTransporte(c);
	}
	
	static void moverTransporte(Transporte trans) {
		System.out.println(trans.mover());
	}
}
