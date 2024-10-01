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
	
	//metodo para adicionar o elemento 
	
	public void adiciona(Tipo elemento) {
		No<Tipo> celula = new No<Tipo>(elemento);
		if(this.inicio == null && this.fim == null) {
			this.inicio = celula;
			this.fim = celula;
		}else {
			this.fim.setProximo(celula);
			this.fim = celula;
		}
		this.tamanho++;
	}
}
