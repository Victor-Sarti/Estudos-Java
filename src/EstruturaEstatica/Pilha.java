package EstruturaEstatica;

public class Pilha<T> extends aula4VetorObject<T> {
	
	public Pilha () {
		super();
	}
	
	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	public void empilha (T elemento) {
		super.adiciona(elemento);
	}
}
