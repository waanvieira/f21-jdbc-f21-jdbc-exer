package cap6;

public class UsaFornecedor {
	public static void main(String[] args) {
		Fornecedor forne = new Fornecedor("Nome fornecedor", "890809890", "", "");
		forne.exibeFornecedor();
		
		Fornecedor forne2 = new Fornecedor("Nome fornecedor", "890809890", "TIpo do produto 1");
		Fornecedor forne4 = new Fornecedor("Nome fornecedor", "890809890", "endereco", "TIpo do produto 1");
		
		forne.exibeFornecedor();
		forne2.exibeFornecedor();
		forne4.exibeFornecedor();
	}

}
