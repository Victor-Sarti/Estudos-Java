package pi;


import java.awt.*;
import javax.swing.*;
public class ExTesteJPanel extends JFrame{
	JButton btGravar, btAlterar, btSair, btCancelar;
	JPanel p1, p2;
	public ExTesteJPanel(){
		setTitle("Teste JPanel");
		setSize(550,200);
		getContentPane().setLayout(new GridLayout(2,1,5,5));
		getContentPane().setBackground(Color.PINK);		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
		p1 = criarPainel(Color.green);		
		p2 = criarPainel(Color.YELLOW);

		btGravar = criarBotao("Gravar");
//		b1.setBounds(20, 20, 100, 30);
		btAlterar = criarBotao("Alterar");
		btSair = criarBotao("Sair");
		btCancelar = criarBotao("Cancelar");
		
//		b2.setBounds(20, 20, 100, 30);

		p1.add(btGravar);
		p1.add(btAlterar);
		
		p2.add(btSair);
		p2.add(btCancelar);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private JButton criarBotao(String texto) {
		JButton botao = new JButton(texto);
		return botao;
	}
	private JPanel criarPainel(Color cor) {
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(2,1,5,5));
//		p1.setBounds(desq, dtopo, larg, alt);
		p1.setBackground(cor);
		add(p1);
		return p1;
	}
	public static void main(String [] args){
		new ExTesteJPanel();
	}
}