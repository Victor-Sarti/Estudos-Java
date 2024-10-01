package lista;

import java.util.LinkedList;

public class Lista {
	public static void main(String[] args) {
			LinkedList<String> lista = new LinkedList <String>();
			
		
			lista.add("Juan");
			lista.add("Guilherme");
			lista.add("Fernando");
			lista.add("Victor");
			
			System.out.println(lista);
			System.out.println("\nTamanho da Lista = " + lista.size());
			System.out.println("\nInicio da Lista = " + lista.getFirst());
			System.out.println("\nFim da Lista = " + lista.getLast());
			System.out.println("\nBuscar informação na 2º posição da lista = " + lista.get(2));
			System.out.println("\nBuscar o nome Victor na lista = " + lista.contains("Victor"));
			lista.remove(2);
			lista.remove("Juan");
			System.out.println(lista);
			System.out.println("\nTamanho da Lista = " + lista.size());

	}

}
