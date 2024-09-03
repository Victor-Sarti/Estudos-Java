package EstruturaEstatica;

public class Lista<T> extends aula4VetorObject<T> {
	
	public Lista (int capacidade) {
		super(capacidade);
	}
	
	public Lista() {
		super();
	}
	
	public boolean adiciona(T elemento) {
		return super.adiciona(elemento);
	}
	
	public boolean adiciona(int posicao, T elemento) {
		return super.adiciona(posicao, elemento);
	}

}
