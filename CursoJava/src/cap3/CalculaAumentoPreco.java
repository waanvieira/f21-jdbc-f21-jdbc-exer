package cap3;

import java.util.Scanner;

public class CalculaAumentoPreco {
	public static void main(String[] args) {
		
		Scanner numeros = new Scanner(System.in);
		
		double resultado;
		
		System.out.println("Digite o valor do produto");
		double valorProduto = numeros.nextDouble();
		
		System.out.println("Digite o valor do aumento");
		double taxaAumento = numeros.nextDouble();
		
		resultado = (valorProduto + valorProduto *taxaAumento/100);
		
		System.out.println("O valor do produto � " + valorProduto);
		System.out.println("O valor do aumento � " + taxaAumento+ "%");
		System.out.println("O valor final � R$" + resultado);
		
		numeros.close();
		
	}

}
