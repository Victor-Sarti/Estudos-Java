package animal;

public class TestaAnimais {
	public static void main(String[] args) {
		// Criando um cachorro

		Cachorro dog1 = new Cachorro();
		dog1.nome = "Max";
		dog1.raca = "Pastor Alemão";
		dog1.info();
		dog1.comer();
		dog1.latir(1);
		dog1.dormir();

		Cachorro dog2 = new Cachorro();
		dog2.nome = "Rex";
		dog2.raca = "PitBull";
		dog2.latir(1);
		dog2.comer();
		dog2.info();
		dog2.dormir();
		dog2.info();
		System.out.println("Mordida");
		dog1.info();
		dog2.morder(dog1);
		
	}

}
