package Animal;

public class TesteTutor {
	public static void main(String[] args) {
		//criando tutor
		Tutor tutor = new Tutor();
		tutor.nome = "Juan";
		tutor.tel = "9666-5845";
		tutor.end = "Av linda da Silva 22";
		
		//criando cachorro 
		Cachorro dog1 = new Cachorro();
		dog1.nome = "Rex";
		dog1.raca = "Pastor Alemão";
		dog1.tutor = tutor;
		
		Cachorro dog2 = new Cachorro();
		dog2.nome = "Lu";
		dog2.raca = "Viralata";
		dog2.tutor = tutor;
		
		dog2.tutor.nome = "Andereson";
		System.out.println(dog1.tutor.nome);
		System.out.println(dog2.tutor.nome);
		System.out.println(tutor.nome);
		
		// criando dog3 usando os construtores
		
		Cachorro dog3 = new Cachorro("Max", "Labrador", tutor);
		System.out.println(dog3.nome);
		System.out.println(dog3.raca);
		System.out.println(tutor.nome);
		
	}

}
