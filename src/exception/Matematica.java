package exception;

public class Matematica {
public static int gerarNumero(int numero) throws Exception{
	int retorno;
	if(numero < 100) {
		throw new Exception("Numero Inválido");
	}
	retorno = (int) (numero * 3 + Math.pow(numero, 5) * Math.sqrt(numero));
	return retorno;
}
	
}
