package pi;

import javax.swing.JOptionPane;

public class CadastrarConta {
	public static void main(String[] args) {
		Conta c = new Conta();
		
		c.setNumero(Integer.parseInt( JOptionPane.showInputDialog("Digite o numero da Conta: ", 1)));
		c.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Deposito: ", 500)));
		c.setLimite(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Limite: ", 2000)));
		c.setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente: ", "Juan"));
		System.out.println(c);
	}
	
	

}
