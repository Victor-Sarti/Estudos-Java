package exception;

public class TesteMatematica {
	public static void main(String[] args) {
		try {
			int valor = Matematica.gerarNumero(99);
			System.out.println(valor);
		}catch (Exception e ){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
