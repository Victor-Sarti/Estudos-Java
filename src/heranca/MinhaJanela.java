package heranca;

import java.awt.Cursor;


import javax.swing.JFrame;

public class MinhaJanela extends JFrame {
	

	
	public MinhaJanela() {
	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //comando para fechar o programa ao fechar a janela
		setBounds(100, 100, 500, 500); //comando para dar tamanho e coordenadas da janela 
		setTitle("Minha Janela");
		setResizable(false); // Proibe de aumentar o tamanho da janela 
		setCursor(Cursor.HAND_CURSOR); // altera o cursor para mãozinha 
		setExtendedState(MAXIMIZED_BOTH); // deixa a janela na tela inteira
		
		
	}
}
