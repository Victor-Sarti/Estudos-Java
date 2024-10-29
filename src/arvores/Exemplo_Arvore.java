
package arvores;

import java.util.Random;

public class Exemplo_Arvore {

	public static void main(String[] args) {
		Random rand = new Random();
		Arvore arvore = new Arvore();
		
		for(int i = 0; i < 10; i++) {
			arvore.insert(rand.nextInt(100), arvore.root);
		}
		
		System.out.println("\nPRE-ORDER:");
		arvore.preOrder(arvore.root);
		
		System.out.println("\nIN-ORDER:");
		arvore.inOrder(arvore.root);
		
		System.out.println("\nPOST-ORDER:");
		arvore.postOrder(arvore.root);
	}
}
