package cap5;

import java.io.ObjectInputStream.GetField;

public class TestaGato {
public static void main(String[] args) {
 Gato g = new Gato();
 g.setNome("Simba");
 g.setRaca("Siames");
 g.setIdade(5);
 g.setAlimentacao(g.getIdade());
 g.setVacina(true);
 g.exibeDados();
 g.exibeVacin();

}
}