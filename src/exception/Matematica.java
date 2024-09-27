package exception;

public class Matematica {
	public static int gerarNum(int numero) throws NumeroInvalidoException {
		int retorno;
			if(numero < 100) {
				throw new NumeroInvalidoException("Número Inválido",5);
				
			}
			retorno = (int) (numero * 3 + Math.pow(numero, 5) + Math.sqrt(numero));
			return retorno;
}
}
