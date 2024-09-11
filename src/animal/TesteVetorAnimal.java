package animal;

public class TesteVetorAnimal {
	public static void main(String[] args) {
		
		
		Cachorro[] cachorros = new Cachorro[10];
		for (int i = 0; i < cachorros.length; i++) {
			cachorros[i] = new Cachorro("Cachorro" + i, "PitBull");
		}
		for (int i = 0; i < cachorros.length; i++) {
				cachorros[i].latir(3);
		}
	}

}
