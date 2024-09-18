package pi;

import javax.swing.JOptionPane;

public class CadastrarConta {
		public static void main(String[] args) {
			Conta c = new Conta();
			criarConta(c);
			
			double saque = Double.parseDouble(
					JOptionPane.showInputDialog("Digite o valor do saque:", 500));
			if(c.sacar(saque)) {
				JOptionPane.showMessageDialog(null, "Saldo após saque:" + c.getSaldo());
			}
			else
				JOptionPane.showMessageDialog(null, "Saldo Insuficiente! " 
						+ "Saque não realizado!");	
			c.depositar(Double.parseDouble(
					JOptionPane.showInputDialog("Digite o valor do depósito:", 500)));		
			System.out.println(c);
			Conta c2 = new Conta();
			criarConta(c2);
			
			double valorTransf = Double.parseDouble(
					JOptionPane.showInputDialog("Digite o valor da transferência:", 500));
			System.out.println("\nAntes da transferência:");
			System.out.println(c2);
			if(c.transferir(c, c2, valorTransf)) {
				System.out.println("\nApós a transferência:");
				System.out.println(c);
				System.out.println(c2);
			}
			else
				System.out.println("Não foi possível realizar a transferência:");
			
		}

		private static void criarConta(Conta c) {
			c.setNumero(Integer.parseInt(
					JOptionPane.showInputDialog("Digite o número da conta" , 1)));
				c.setSaldo(Double.parseDouble(
					JOptionPane.showInputDialog("Digite o valor do depósito inicial:", 500)));
				c.setLimite(Double.parseDouble(
						JOptionPane.showInputDialog("Digite o limite para conta:", 2000)));
				c.setNome(JOptionPane.showInputDialog("Digite o nome do cliente:", "Maria"));
		}
	}
	


