package cap3;

public class OperadorTernario {
	public static void main (String[] args) {
		int x = 10;
		int y = 2;
		String resultado = (x/y > 2 ? "Sim" : "n�o");
		//System.out.println(x/y < 2 "sim" : "N�o");
		
		System.out.println("Resultado: " + resultado);
	}
}
