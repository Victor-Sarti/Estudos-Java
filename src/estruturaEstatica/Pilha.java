package estruturaEstatica;

public class Pilha<T> extends aula4VetorObject<T> {

	public Pilha() {
		super();
	}

	public Pilha(int capacidade) {
		super(capacidade);
	}

	public void empilha(T elemento) {
		super.adiciona(elemento);
	}

	public T topo() {
		if (this.estaVazia()) {
			return null;
		} else {
			return this.elementos[tamanho - 1];
		}
	}

	public T desempilhar() {
		if (this.estaVazia()) {
			return null;
		}
		T elemento = this.elementos[tamanho - 1];
		tamanho--;
		return elemento;
	}
}
