package lista;

public class Lista {
	public static void main(String[] args) {
			ListaEncadeada<String> lista = new ListaEncadeada <>();
			
			System.out.println("Tamanho da Lista = " +lista.getTamanho());
			
			lista.adiciona("Juan");
			lista.adiciona("Guilherme");
			lista.adiciona("Fernando");
			lista.adiciona("Victor");
			
			System.out.println(lista);
			System.out.println("\nTamanho da Lista = " + lista.getTamanho());
			System.out.println("\nInicio da Lista = " + lista.getInicio().getElemento());
			System.out.println("\nFim da Lista = " + lista.getFim().getElemento());
			
			lista.remover("Victor");
			System.out.println(lista);
			System.out.println("\nTamanho da Lista = " + lista.getTamanho());
			System.out.println("\nInicio da Lista = " + lista.getInicio().getElemento());
			System.out.println("\nFim da Lista = " + lista.getFim().getElemento());
	}

}
