package recursividade;

public class BubbleSort {
	public static void main(String[] args) {
		// criando vetor int com 10 posicoes

		int[] vetor = new int[10];

		// inserindo valores no vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			// exibindo os valores do vetor
			System.out.println(vetor[i]);

		}
		
		// metodos de ordenaçao BubbleSort
		int aux;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}

		}
		System.out.println("Vetor ordenado: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}
