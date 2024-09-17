package estruturaEstatica;

public class TesteFila {
	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<Integer>();
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
	
		// vamos vizualizar a fila  
		System.out.println(fila.tamanho());
		// desenfila
		System.out.println(fila.desenfila());
		
		System.out.println(fila.toString());
		
	
	
	}
	
	

}
