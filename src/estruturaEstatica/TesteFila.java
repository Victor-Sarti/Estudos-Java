package estruturaEstatica;

public class TesteFila {
	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<Integer>();
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
	
		// espiar a fila 
		System.out.println(fila.espiar());
		// para mascarar e deixar a respostas mais bonita
		
		if(fila.espiar() == null) {
			System.out.println("Ninguem na Fila");
		}else {
			System.out.println("O elemento da primeira poição é " + fila.espiar());
		}
		
	
	}
	
	

}
