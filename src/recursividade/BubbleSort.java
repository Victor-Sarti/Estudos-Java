package recursividade;

public class BubbleSort {
public static void main(String[] args) {
	//criando vetor int com 10 posicoes 
	
	int [] vetor = new int [10];
	
	//inserindo valores no vetor
	for(int i = 0; i < vetor.length; i++) {
		vetor[i] = (int) (Math.random() * vetor.length);
		
		//exibindo os valores do vetor
		System.out.println(vetor[i]);
			
		
	}
}
}
