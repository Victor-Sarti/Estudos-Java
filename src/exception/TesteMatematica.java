package exception;

import java.util.Scanner;

public class TesteMatematica {
	public static void main(String[] args) {
		
	
	int valor, gerar;
	Scanner ler = new Scanner(System.in);
	do {
		try {
			System.out.println("Digite um valor: ");
			valor = ler.nextInt();
			gerar = Matematica.gerarNum(valor);
			break;
		}catch(NumeroInvalidoException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCodigoErro());
		}
	}while(true);
}
}
