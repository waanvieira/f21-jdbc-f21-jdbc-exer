package cap3;

public class DescontoTernario {
	public static void main(String[] args) {
		double valorCompra = 4000;
		
		double valorAPagar = valorCompra <=1000 ? valorCompra : 
							valorCompra <= 3000 ? valorCompra * 0.95 :
							valorCompra *0.90;
		
		System.out.println("Valor da compra " + valorCompra);
		System.out.println("valor a pagar" + valorAPagar);
	}
}
