package cap2;

public class DeclaracaoDeVariaveis {
	public static void main(String[] args) {
		int numero;
		numero = 8;		
		String texto = "palavra";		
		char c = 'a';		
		double valorDecimal = 10.8;
		{	
			String telefone = "11  9897897987";
			System.out.println("Valor de numero � " + numero);
			System.out.println("Valor de flutuante � " + valorDecimal);
		}
		//Esse codigo esta dando erro porque esta fora do escopo
		//System.out.println("Telefone " + telefone);
		
	}
}
