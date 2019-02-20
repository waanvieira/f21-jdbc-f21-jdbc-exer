package cap6;

public class Fornecedor {
	private String nome;
	private String telefone;
	private String endereco;
	private String tipoProduto;
	
	Fornecedor(){
		
	}
	Fornecedor(String nome, String telefone, String endereco, String tipoProduto){
		setNome(nome);
		setTelefone(telefone);
		setTelefone(endereco);
		setTipoProduto(tipoProduto);					
	}
	
	Fornecedor(String nome, String telefone, String tipoProduto){
		setNome(nome);
		setTelefone(telefone);
		setTipoProduto(tipoProduto);					
	}
	//nome
	String getNome() {
		return nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	//endereco
		String getEndereco() {
			return endereco;
		}
		
		void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		//telefone
				String getTelefone() {
					return telefone;
				}
				
				void setTelefone(String telefone) {
					this.telefone = telefone;
				}
				//tipo produto
				String getTipoProduto() {
					return tipoProduto;
				}
				
				void setTipoProduto(String tipoProduto) {
					this.tipoProduto = tipoProduto;
				}
				
		void exibeFornecedor() {
			System.out.println("Nome fornecedor" + getNome());
			System.out.println("Telefone" + getTelefone());
			System.out.println("Endereco" + getEndereco());
			System.out.println("Tipo Produto" + getTipoProduto());
			System.out.println("----------------------------------------" );

		}
}
