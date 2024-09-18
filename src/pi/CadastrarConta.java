package pi;

import javax.swing.JOptionPane;

public class CadastrarConta {
	public static void main(String[] args) {
		Conta c = new Conta();

		criarConta(c);

		double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque ", 200));
		if (c.sacar(saque)) {
			JOptionPane.showMessageDialog(null, "Saldo apos o saque " + c.getSaldo());
		} else {
			JOptionPane.showMessageDialog(null, "Saldo Insuficiente" + "Saque realizado");
			c.depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: ", 500)));

			System.out.println(c);

		}
	}

	private static void criarConta(Conta c) {
		c.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da Conta: ", 1)));
		c.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Deposito: ", 500)));
		c.setLimite(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Limite: ", 2000)));
		c.setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente: ", "Juan"));
		System.out.println(c);

	}

}
