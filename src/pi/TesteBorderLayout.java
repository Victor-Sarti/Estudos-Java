package pi;

import java.awt.*;
import javax.swing.*;
public class TesteBorderLayout extends JFrame{	
	public TesteBorderLayout(){
		setTitle("Teste BorderLayout");
		setSize(350,150);
		Container c = getContentPane();
		c.setBackground(new Color(255,255,255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		BorderLayout bl = new BorderLayout(5,5);		
		c.setLayout(bl);
		//segure o ALT + letra
		JButton b1 = criarBotao("Botao Norte" , BorderLayout.NORTH, 'N');
		JButton b2 = criarBotao("Botao Sul" , BorderLayout.SOUTH, 'S');
		JButton b3 = criarBotao("Botao Leste", BorderLayout.EAST, 'L');
		JButton b4 = criarBotao("Botao Oeste", BorderLayout.WEST, 'O');
		JButton b5 = criarBotao("Botao Centro", BorderLayout.CENTER, 'C');
		setVisible(true);		
	}
	
	private JButton criarBotao(String texto, String posicao, char c) {
		JButton b1 = new JButton(texto);
		b1.setMnemonic(c);
		add(b1,posicao);
		return b1;
	}

	private JButton criarBotao(String texto, String posicao) {
		JButton b1 = new JButton(texto);
		add(b1, posicao);
		return b1;
	}

	public static void main(String [] args){
    	new TesteBorderLayout();
  }
}