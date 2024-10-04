package bancoInterface;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MeuFrame extends JFrame {

	JButton meuBotao;
	
	public MeuFrame() {
		//meu Botao
		
		meuBotao = new JButton("Meu botão");
		meuBotao.setBounds(20, 20, 100, 30);
		
		//frame
		getContentPane().setLayout(null);
		getContentPane().add(meuBotao);
		setBounds(100, 100,300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MeuFrame();
	}
	
	
	}


