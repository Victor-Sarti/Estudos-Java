package pi;

public class HerancaFornecedor {
	private String nome, fone;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public HerancaFornecedor() {	}

	public HerancaFornecedor(String nome, String fone) {
		this.nome = nome;
		this.fone = fone;
	}

	@Override
	public String toString() {
		return "Fornecedor [Nome = " + nome + ", fone=" + fone + "]";
	}	
}
