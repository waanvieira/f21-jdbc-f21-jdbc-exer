package ExerciciosArray;


public class ArrayNumeros {
	public static void main(String[] args){
	int a =1;
	int a2 =2;
	int a3 =3;
	int a4 =4;
	int a5 =5;
	int a6 =6;
	int a7 =7;
	int a8 =8;
	int a9 =9;
	int a10 =10;
	
	int numeros [] = new int[10];
	numeros[0] = a;
	numeros[1] = a2;
	numeros[2] = a3;
	numeros[3] = a4;
	numeros[4] = a5;
	numeros[5] = a6;
	numeros[6] = a7;
	numeros[7] = a8;
	numeros[8] = a9;
	numeros[9] = a10;
	
	/*for(int i= 0; i <numeros.length; i++) {
		System.out.println("Numero: " + numeros[i]);
	}
	*/
	for(int i : numeros) {
		System.out.println("Texto: " + i);
		
	}
	
	
		
	}

}
