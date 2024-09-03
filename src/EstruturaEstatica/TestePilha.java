package EstruturaEstatica;

public class TestePilha {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		System.out.println(pilha);
		System.out.println("Desempilhar elemento" +pilha.desempilhar());
		System.out.println(pilha);
	}

}
