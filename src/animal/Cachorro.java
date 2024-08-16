package animal;

import java.util.Iterator;

public class Cachorro {
	
	//Atributos (estados)
	public String nome, raca;
	private boolean fome = false;

	// Métodos (comportamento)
	public void latir(int latindo) {
		System.out.println(this.nome + " Latindo: ");
		for (int i = 0; i < latindo; i++) {
			System.out.println("Au Au");
		}
	}

	public void info() {
		System.out.println("Nome:" + this.nome + "\nRaça:" + this.raca);
//		if(fome) {
//			System.out.println("Estou com fome");
//		}else{
//			System.out.println("Não estou com fome");
//		}
//		if(dormir) {
//			System.out.println("Estou dormindo");
//		}else{
//			System.out.println("Preciso comer para dormir");
//		}

		// CONDIÇÃO ? VALOR SE V : VALOR SE F
		System.out.println(fome ? "Estou com fome" : "Não estou com fome");
	}

	public void comer() {
		if (fome) {
			fome = false;
		}
	}

	public void dormir() {
		System.out.println("zzzzzzzzzzz");
		fome = true;
	}
	
	private void chorar() {
		System.out.println("uim uim uim (chorando)");
	}
	
	public void morder(Cachorro dog) {
		dog.chorar();
		dog.fome = true;
	}
}
