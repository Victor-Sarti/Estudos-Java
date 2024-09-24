package recursividade;

public class QuickSort {
	public static void main(String[] args) {

		// criando vetor int com 100 posicoes
		int[] vetor = new int[100];

		// inserindo valores no vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			// exibindo os valores do vetor
			System.out.println(vetor[i]);
		}

		// chamando o metodo para a ordenaçao
		ordenaQuickSort(vetor, 0, vetor.length - 1);
		System.out.println("Nosso vetor Ordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

	// metodo para ordenar
	static void ordenaQuickSort(int[] vetor, int esquerda, int direita) {
		if (esquerda < direita) {
			int p = particao(vetor, esquerda, direita);
			ordenaQuickSort(vetor, esquerda, p);
			ordenaQuickSort(vetor, p + 1, direita);
		}
	}

	// metodo para criar as participacoes (dividir o vetor em partes)
	static int particao(int[] vetor, int esquerda, int direita) {
		int meio = (int) (esquerda + direita) / 2;
		int pivo = vetor[meio];
		int i = esquerda - 1;
		int j = direita + 1;
		while (true) {
			do {
				i++;
			} while (vetor[i] < pivo);
			do {
				j--;
			} while (vetor[j] > pivo);
			if (i >= j) {
				return j;
			}
			int aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
		}
	}

}
