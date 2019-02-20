package cap4;

public class ControleDecisaoIfElse {
	public static void main(String[] args) {
		double valorDaCompra = 1800;
		double valorApagar = 0;
		
		if(valorDaCompra >=2000) 
			valorApagar = valorDaCompra * 0.90;	
			else if(valorDaCompra >= 1000)	
				valorApagar = valorDaCompra * 0.80;
				else 				
					valorApagar = valorDaCompra;
			
		System.out.println("valor a pagar é " + valorApagar);
	}
}
