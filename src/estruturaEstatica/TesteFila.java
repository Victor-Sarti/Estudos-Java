package estruturaEstatica;

public class TesteFila {
	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<Integer>();
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
	
		//vamos verificar se a fila esta vazia 
		
		System.out.println("A fila está vazia? " + fila.estaVazia());	
		
		//vamos verificar o tamanho da minha fila apos enfileirar 
		System.out.println("Qual o tamanho da fila: " +fila.tamanho());
		
		// vamos vizualizar os elementos dentro da fila 
		System.out.println(fila.toString());
	
	}
	
	

}
