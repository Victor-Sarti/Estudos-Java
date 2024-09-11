package adoPI;
//VICTOR GABRIEL SARTI MIRANDA 

import javax.swing.JOptionPane;
public class TesteIMC {
	public static void main(String[] args) {
		int resp = 0;
		CalculoIMC cal = new CalculoIMC();

		do {
			cal.setSexo(Integer.parseInt(JOptionPane.showInputDialog("Informe seu sexo (1 para Masculino, 2 para Feminino)")));
			cal.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso", "Exemplo: 120")));
			cal.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura", "Exemplo: 1.60")));

			cal.IMC();

			resp = JOptionPane.showConfirmDialog(null, "Deseja calcular outro IMC?");
		} while (resp == JOptionPane.YES_OPTION);
	}
}
