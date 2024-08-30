package banco;

import java.util.Scanner;
import banco.ContaCorrente;

public class TesteArrayContas {
	public static void main(String[] args) {
		Cliente[] cliente = new Cliente [5];
		ContaCorrente[] contaCorrente = new ContaCorrente [5];
		double valor;
		int opcao, qtd, num, posic;
		Scanner huf = new Scanner(System.in);

		do {
			System.out.println("Informe a opção desejada");
			System.out.println("1. Criar conta\n" + "2. Criar clientes\n" + "3. Associar cliente a conta\n"
					+ "4. Realizar deposito\n " + "5. Realizar transfências\n" + "6. Exibir dados do cliente" + "");
			opcao = huf.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("quantas contas deseja criar?");
				qtd = huf.nextInt();
				contaCorrente = new ContaCorrente[qtd];
				break;
			case 2:
				System.out.println("Quantos clientes deseja criar?");
				qtd = huf.nextInt();
				cliente = new Cliente[qtd];
			default:
				break;
			case 3:
				System.out.println("Qual posição do cliente deseja asociar?");
				posic = huf.nextInt();
				Cliente c = cliente[posic];
				contaCorrente[posic].titular = c;

			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				break;
			}
		} while (opcao != 8);
	}
}
