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
		
		JButton b1 = criarBotao("Botao Norte" , BorderLayout.NORTH);
		JButton b2 = criarBotao("Botao Sul" , BorderLayout.SOUTH);
		JButton b3 = criarBotao("Botao Leste", BorderLayout.EAST);
		JButton b4 = criarBotao("Botao Oeste", BorderLayout.WEST);
		JButton b5 = criarBotao("Botao Centro", BorderLayout.CENTER );
		setVisible(true);		
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