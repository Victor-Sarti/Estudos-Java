package estruturaEstatica;

public class Fila<T> extends aula4VetorObject<T> {

	public Fila() {
		super();
	}
	public Fila (int capacidade) {
		super(capacidade);
	}
	
	 public void enfileirar(T elemento) {
		 
		 this.adiciona(elemento);
	 }
	
	 public T espiar() {
		 if(this.estaVazia()) {
			 return null;
		 }
		 return this.elementos[0];
	 }
	
	
}
 