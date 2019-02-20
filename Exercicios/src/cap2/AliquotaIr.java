package cap2;

import java.util.Scanner;

public class AliquotaIr {
	public static void main(String[] args) {
		Scanner aliquota = new Scanner(System.in);
		double salario;
		double ir = 0;
		
		System.out.println("Digite o seu salario");
		 salario = aliquota.nextDouble();
		
		if(salario <= 1903.98) {
			ir = 0;
		}
		else if(salario <=2826.25) {
				ir = 7.5;
		}else if(salario <=3751.05) {
			ir = 15.0;
		}else if(salario <=4664.68) {
			ir = 22.5;
		}else {
			ir = 27.5;
		}
		
		System.out.println("Seu salario é " + salario);
		System.out.println("IR " + ir);
		
		aliquota.close();
		}
	
}
