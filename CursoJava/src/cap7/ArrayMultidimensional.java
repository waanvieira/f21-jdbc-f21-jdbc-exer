package cap7;

public class ArrayMultidimensional {
	public static void main(String[] args) {
	
	String  cidades [][] = new String[3][2];
	cidades[0][0] = "S�o Paulo";
	cidades[0][1] = "Barretos";
	cidades[1][0] = "Belo Horizonte";
	cidades[1][1] = "Ouro preto";
	cidades[2][0] = "Curitiba";
	cidades[2][1] = "Londrina";
	
	String cidades2 [][] = {{"S�o Paulo" },{""}};
	
	for(int i = 0; i < cidades.length; i++) {
		for(int j = 0; j < cidades.length; j++){
			System.out.println(cidades[i][j]);
		}
	
 	}
}
}
