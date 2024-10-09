package pi;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  
public class ExFlowLayout extends JFrame
{
	private JButton botao1, botao2, botao3, botao4,
	botao5, botao6;

	private Container c; //criação do objeto tipo Container

	public ExFlowLayout()//criação do método construtor da classe
	{
		super("Exemplo  de Layout de Fluxo");
		c = getContentPane();

		//definindo o layot como de Fluxo
		c.setLayout( new FlowLayout()); 
		botao1 = criarBotao("Botão 1", '1'); 
		botao2 = criarBotao("Botão 2", '2');
		botao3 = criarBotao("Botão 3", '3');
		botao4 = criarBotao("Botão 4", '4');
		botao5 = criarBotao("Botão 5", '5');
		botao6 = criarBotao("Botão 6", '6');

		//criação dos botões
		c.add(botao1);
		c.add(botao2);
		c.add(botao3);
		c.add(botao4);
		c.add(botao5);
		c.add(botao6);
		//criação dos botões
		c.add(botao1);
		c.add(botao2);
		c.add(botao3);
		c.add(botao4);
		c.add(botao5);
		c.add(botao6);
		setSize(350, 120);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);   
	}
	public static void main( String args[] ){
		new ExFlowLayout();      
	}
	public static JButton criarBotao(String texto, char c) 	{
		JButton botao = new JButton(texto);
		botao.setBackground(new Color(0,0,170));
		botao.setForeground(Color.YELLOW);
		botao.setFont(new Font("Helvetica", Font.BOLD, 14));
		botao.setToolTipText("Botao de comando");
		botao.setHorizontalAlignment(SwingConstants.CENTER);
		botao.setVerticalAlignment(SwingConstants.CENTER);
		botao.setMnemonic(c); 
		return botao;
	}
}