package ExerciciosArray;

public class ArrayTexto {
	public static void main (String[] args) {
		String texto[] = new String[5];
		texto[0] ="um";
		texto[1] ="dois";
		texto[2] ="tres";
		texto[3] ="quatro";
		texto[4] ="cinco";
		
		/*for(int i = 0; i <texto.length; i++) {
			System.out.println("Texto: " + texto[i]);
		}
		*/
		for(String s : texto) {
			System.out.println("Texto: " + s);
			
		}
	}
}
