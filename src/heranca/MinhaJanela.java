package heranca;

import javax.swing.JFrame;

public class MinhaJanela extends JFrame {
	public MinhaJanela() {
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //comando para fechar o programa ao fechar a janela
		setBounds(100, 100, 500, 500); //comando para dar tamanho e coordenadas da janela 
	}
}
