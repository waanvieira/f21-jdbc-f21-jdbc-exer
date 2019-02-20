package cap11;

public class Fruta {
	String nomeDaFruta;
	String vitaminas;
	String beneficios;
	
	public Fruta(String nomeDaFruta, String vitaminas, String beneficios) {
		this.nomeDaFruta = nomeDaFruta;
		this.vitaminas = vitaminas;
		this.beneficios = beneficios;
		
	}
	
	public Fruta(String nomeDaFruta) {
		this.nomeDaFruta = nomeDaFruta;
	}
	
	public String toString() {
		return "Fruta [nomeDaFtura=" + nomeDaFruta + "]";
	}
	
}
