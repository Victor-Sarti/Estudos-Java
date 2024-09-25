package pi;

import java.awt.Color;

import javax.swing.JFrame;

public class TesteJFrame extends  JFrame {
	public TesteJFrame() {
		setTitle("Primeira Janela Swing");//titulo da janela 
		setSize(375,100);
		getContentPane().setLayout(null);//anula o layout
		//cpr de fundo da janela no padrao RGB 
		getContentPane().setBackground(new Color(255,255,255));
		setVisible(true);//exibindo a janela 
		//provoca o termino da execucao
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new TesteJFrame();
	}

}
