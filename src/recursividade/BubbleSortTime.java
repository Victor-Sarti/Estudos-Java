package recursividade;

public class BubbleSortTime {
	public static void main(String[] args) {
		int[] vetor = new int[1000];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			// metodos de ordenacao BublleSort

		}
		// variavel que registra o tempo de execucao no inicio
			long inicio = System.currentTimeMillis();

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
		// variavel para registrar o tempo de execucao 
		long fim = System.currentTimeMillis();
		
		// exibindo o tempo de execucao 
		System.out.println("Tempo de Execução: " + (fim - inicio));
	}

}
