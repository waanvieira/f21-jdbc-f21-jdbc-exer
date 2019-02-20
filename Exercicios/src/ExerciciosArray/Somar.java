package ExerciciosArray;

public class Somar {

	static double somar(double a, double b, double c) {
		return a + b + c;
		
	}
	
	static double somar(double numeros[]) {
		double resultado = 0;
		for (double num : numeros) {
			resultado += num;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		double resultado = somar(new double[] {2, 3, 4});
		
		System.out.println("Primeiro resultado: " + resultado);
		System.out.println("Segundo resultado: " + resultado);
		System.out.println("outra possibiliade: " + somar(new double[] {20, 30, 40}));
		}
}
