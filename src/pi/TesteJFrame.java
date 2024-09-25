package pi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

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
		centralizar();
		
	}
	public static void main(String[] args) {
		new TesteJFrame();
	}
	
	public void centralizar() {
		//obtem a altura e largura da resolucao video 
		Dimension screen =
				Toolkit.getDefaultToolkit().getScreenSize();
		//obtem a altura e largura da minha janela 
		Dimension janela = getSize();
		
		if(janela.height > screen.height)
			setSize(janela.width, screen.height);
		if(janela.width > screen.width)
			setSize(screen.width, janela.height);
		
		setLocation((screen.width - janela.width)/2,
				(screen.height - janela.height)/2);
	}

}
