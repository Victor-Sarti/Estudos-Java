package EstruturaEstatica;

public class TestePilha {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		System.out.println(pilha);
		System.out.println(pilha.estaVazia());
		pilha.empilha(1);
		System.out.println(pilha);
		System.out.println(pilha.estaVazia());
	}

}
