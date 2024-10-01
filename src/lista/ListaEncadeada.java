package lista;

public class ListaEncadeada<Tipo> {
	private No inicio;
	private No fim;
	private int tamanho;

	// metodo construtor

	public ListaEncadeada() {
		this.tamanho = 0;
	}

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public No getFim() {
		return fim;
	}

	public void setFim(No fim) {
		this.fim = fim;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	// metodo exibicao
	@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio + "]";
	}
}
