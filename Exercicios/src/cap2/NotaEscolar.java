package cap2;

import java.util.Scanner;

public class NotaEscolar {
	public static void main (String[] args) {
		//Calcular media do aluno
		double resultado;
		Scanner notas  = new Scanner(System.in);
		System.out.println("Digite a nota 1" );
		double nota1 = notas.nextDouble();
		
		System.out.println("Digite a nota 2" );
		double nota2 = notas.nextDouble();
		
		System.out.println("Digite a nota 3" );
		double nota3 = notas.nextDouble();
		
		resultado = (nota1 + nota2 + nota3) / 3;
		
		if (resultado <=5) {
			System.out.println("Voc� esta reprovado com resultado " + resultado);
		}else if(resultado < 7 ){
			System.out.println("Voc� esta em recupera��o com nota" + resultado);			
		}else {
			 System.out.println("Voc� esta aprovado nota" + resultado);
		}
		
		notas.close();
		
	}
}
