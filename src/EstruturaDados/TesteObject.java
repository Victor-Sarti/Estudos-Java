package EstruturaDados;

public class TesteObject {
	public static void main(String[] args) throws Exception{
		VetorObjeto vetor = new VetorObjeto(5);
		
		Contato c1 = new Contato("Juan", "9999-999", "juanmaicon@gmail.com");
		Contato c2 = new Contato("Bruno", "9999-999", "BrunoMiranda@gmail.com");
		Contato c3 = new Contato("DaPraia", "9999-999", "DaPraia32@gmail.com");
		
		try {
			vetor.adiciona(c1);
			vetor.adiciona(c2);
			vetor.adiciona(c3);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Tamanho do vetor: " + vetor.tamanho);
		System.out.println(vetor);
		
	}

}
