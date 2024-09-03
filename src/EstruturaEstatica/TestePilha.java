package EstruturaEstatica;

public class TestePilha {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		System.out.println(pilha.topo());
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		System.out.println(pilha.topo());
		System.out.println(pilha);
	}

}
