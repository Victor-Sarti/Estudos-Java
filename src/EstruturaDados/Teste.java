package EstruturaDados;

public class Teste {
	public static void main(String[] args) throws Exception {
		Vetor vetor = new Vetor(5);
		try {
			vetor.adicionar("elemento1");
			vetor.adicionar("elemento2");
			vetor.adicionar("elemento3");
		}catch (Exception e ){
			e.printStackTrace();
		}
		System.out.println(vetor.tamanho());
		System.out.println(vetor.toString());
		System.out.println(vetor.busca(2));
		System.out.println(vetor.busca1("elemento1"));
		System.out.println(vetor.busca1("elemento2"));

	}

}
