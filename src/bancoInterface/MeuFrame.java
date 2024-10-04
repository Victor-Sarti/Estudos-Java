package bancoInterface;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;

import javax.swing.JButton;

public class MeuFrame extends JFrame implements ActionListener {

	JButton meuBotao;
	
	public MeuFrame() {
		//meu Botao
		meuBotao = new JButton("Meu botão");
		meuBotao.setBounds(20, 20, 100, 30);
		meuBotao.addActionListener(this);
		MeuActionListener listener = new MeuActionListener();
		meuBotao.addActionListener(listener);
		//botao caso eu nn queira reaproveitar ele para outra classe
		//criando uma classe anonima 
		meuBotao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clique no Botão 3° vez ");
				
			}
		});

		
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
	
	@Override
	// COMANDO PARA DAR FUNCIONALIDADE AO BOTAO
	public void actionPerformed(ActionEvent e) {
		System.out.println("Clique no Botão");
	}
	
	//CLASSE INTERNA
	class MeuActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Clique no Botão 2° vez");
		}
	}
	
	
	}


