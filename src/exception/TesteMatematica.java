package exception;

public class TesteMatematica {
	public static void main(String[] args) throws NumeroInvalidoException {
		try {
			int retorno;
		}catch (NumeroInvalidoException e ){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
