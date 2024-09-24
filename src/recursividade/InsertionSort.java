package recursividade;

public class InsertionSort {
	public static void main(String[] args) {
		// criando vetor int com 10 posicoes
		int[] vetor = new int[10];
		// inserindo valores no vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			// exibindo os valores do vetor
			System.out.println(vetor[i]);
		}
		// metodos de ordenaçao InsertionSort
		int aux, j;
		for (int i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			j = i - 1;
			while (j >= 0 && vetor[j] > aux) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = aux;
		}
		System.out.println("Vetor ordenado: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}
