package recursividade;

public class InsertionSortTime {
	public static void main(String[] args) {
		// criando vetor int com 10 posicoes
		int[] vetor = new int[100];
		//tempo de execucao 100int = 0s
		//tempo de execucao 1000int = 5s
		//tempo de execucao 100int = 160s
		
		
		
		// inserindo valores no vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			// exibindo os valores do vetor
			System.out.println(vetor[i]);
		}
		// variavel que registra o tempo de execucao no inicio
					long inicio = System.currentTimeMillis();
		// metodos de ordenaçao InsertionSort
		int menor_posicao, aux;
		for (int i = 0; i < vetor.length; i++) {
			menor_posicao = 1;
			for(int j = i + 1; j < vetor.length; j++) {
				if(vetor[j] < vetor[menor_posicao]) {
					menor_posicao = j;
				}
				aux = vetor [ menor_posicao];
				vetor[menor_posicao] = vetor[i];
				vetor[i] = aux;
			}
		}
		// variavel para registrar o tempo de execucao 
		long fim = System.currentTimeMillis();
		
		// exibindo o tempo de execucao 
		System.out.println("Tempo de Execução: " + (fim - inicio));
		
	}

}
