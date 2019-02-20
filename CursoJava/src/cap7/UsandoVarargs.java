package cap7;

public class UsandoVarargs {
	public static void main(String[] args) {
		System.out.println("Resultado: " + somar(2, 3));
		System.out.println("Resultado: "+ somar(2, 3, 4));
		System.out.println("Resultado: "+ somar(2, 3, 4, 6));

	}
	
	public static int somar(int...inteiros) {
		int resultado =0;
		for(int i =0; i<inteiros.length; i++) {
			resultado += inteiros[i];
		}
		return resultado;
	}

}
