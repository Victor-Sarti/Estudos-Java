package pi;

import javax.swing.JOptionPane;

public class CadastrarConta {
		public static void main(String[] args) {
			int resp=0;		
			Conta c1 = new Conta();
			criarConta(c1);
			Conta c2 = new Conta();	
			criarConta(c2);
			do {
			String tipo[] = {"Transferir", "Sacar", "Depositar", "Pagar Conta"};				
			Object escolha = JOptionPane.showInputDialog(null, 
					"Escolha o que deseja fazer:",
					"Escolha de operação", 3, 
					null, tipo, tipo[0]);
			
			if(escolha.equals("Transferir")) {
				double valor = Double.parseDouble(JOptionPane.showInputDialog(
						"Digite o valor da transferência: "));
				realizarTranferencia(c1, c2, valor);				
			}
			else if(escolha.equals("Sacar")) {
				double valor = Double.parseDouble(JOptionPane.showInputDialog(
						"Digite o valor do saque: "));
				realizarSaque(c1);
			}
			else if(escolha.equals("Depositar")) {
				double valor = Double.parseDouble(JOptionPane.showInputDialog(
						"Digite o valor do depósito: "));
				realizarDeposito(c1);			
			}
			else if(escolha.equals("Pagar Conta")) {
				String documento = JOptionPane.showInputDialog(
						"Digite o Título do documento: ");
				double valor = Double.parseDouble(JOptionPane.showInputDialog(
						"Digite o valor do documento: "));
				c1.pagarConta(documento, valor);			
			}
			
			resp = JOptionPane.showConfirmDialog(null, "Efetuar outra operação?");
			}while(resp==0);
		}
		

		

		private static void realizarTranferencia(Conta c, Conta c2, double valorTransf) {
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

		private static void realizarDeposito(Conta c) {
			System.out.println("Antes do depósito: " + c.getSaldo());
			c.depositar(Double.parseDouble(
					JOptionPane.showInputDialog("Digite o valor do depósito:", 500)));
			System.out.println("Depois do depósito: " + c.getSaldo());
		}

		private static void realizarSaque(Conta c) {
			double saque = Double.parseDouble(
					JOptionPane.showInputDialog("Digite o valor do saque:", 500));
			if(c.sacar(saque)) {
				System.out.println("Saldo após saque:" + c.getSaldo());
			}
			else
				System.out.println("Saldo Insuficiente! " + 
						(c.getSaldo()+c.getLimite()));
		}

		private static void criarConta(Conta c) {
			c.setNumero(Integer.parseInt(
					JOptionPane.showInputDialog("Digite o número da conta" , 1)));
				c.setSaldo(Double.parseDouble(
					JOptionPane.showInputDialog("Digite o valor do depósito inicial:", 500)));
				c.setLimite(Double.parseDouble(
						JOptionPane.showInputDialog("Digite o limite para conta:", 2000)));
				c.setNome(JOptionPane.showInputDialog("Digite o nome do cliente:", "Maria"));
				System.out.println(c);			
		}
		
		
		
		private static Conta escolherConta(Conta contaPF, Conta contaPJ) {
			String tipo[] = {"PF", "PJ"};			
			Object escolha = JOptionPane.showInputDialog(null, 
					"Escolha o que deseja fazer:",
					"Escolha de operação", 3, 
					null, tipo, tipo[0]);
			
			Conta c = null;
			if(escolha.equals("PF"))
				c = contaPF;
			else if(escolha.equals("PJ"))
				c = contaPJ;
			return c;
		}
	}
	

	


