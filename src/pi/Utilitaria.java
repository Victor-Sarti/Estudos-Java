package pi;

import javax.swing.JOptionPane;

public class Utilitaria {
	
	public static boolean validarCNPJ(String cnpj) {
		String cnpjLimpo = limparCNPJ(cnpj);		
		JOptionPane.showMessageDialog(null, "CNPJ Limpo : "  + cnpjLimpo);

		return false; 	
	}
	
	private static String limparCNPJ(String cnpj) {
		String cnpjLimpo="";
		for (int i = 0; i < cnpj.length(); i++) {
			if(cnpj.charAt(i)=='.' || cnpj.charAt(i)=='/' || cnpj.charAt(i)=='-')
				continue;
			else
				cnpjLimpo += cnpj.charAt(i);
		}
		return cnpjLimpo;
	}

	public static void main(String[] args) {
		String cnpj = JOptionPane.showInputDialog("Digite o CNPJ", "11.222.333/0001-81");
		
		System.out.println(cnpj);
		if(Utilitaria.validarCNPJ(cnpj))
			JOptionPane.showMessageDialog(null, "cnpj: " + cnpj + " válido!");
		else
			JOptionPane.showMessageDialog(null, "cnpj: " + cnpj + " Inválido!");
	}


}
