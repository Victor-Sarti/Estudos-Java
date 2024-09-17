package estruturaEstatica;
import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {
	public static void main(String[] args) {
		Queue<Integer>fila = new LinkedList<Integer>();
		
		
		
		fila.add(1);
		fila.add(2);
		fila.add(3);
		
		System.out.println("Tamanho da Fila: " + fila.size());
		System.out.println("Dados da Fila: " + fila.toString());
		System.out.println(fila.peek());
		System.out.println(fila.remove(1));
		System.out.println(fila.toString());
		
	
	}

}
