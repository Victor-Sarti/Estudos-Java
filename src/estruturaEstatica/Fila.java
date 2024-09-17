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
	 	
	 public T desenfila(){
		 if(this.estaVazia()) {
			 return null;
		 }
		 // ja temos um metodo para remover na classe pai  porem precisa indicar a posicao e para isso vamos criar uma constante
		 final int POS = 0;
		 T elementoASerRemovido = this.elementos[POS];
		 this.remove(POS);
		 return elementoASerRemovido;
	 }
	 
}
 