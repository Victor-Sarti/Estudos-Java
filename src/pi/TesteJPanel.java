package pi;

import java.awt.*;
import javax.swing.*;
public class TesteJPanel extends JFrame{
	JButton b1, b2;
	JPanel p1, p2;
	public TesteJPanel(){
		setTitle("Teste JPanel");
		setSize(200,200);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(255,255,255));		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(10, 10, 140, 70);
		p1.setBackground(Color.BLUE);

		p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(10,90,140,70);
		p2.setBackground(Color.YELLOW);

		b1 = new JButton("Gravar");
		b1.setBounds(20, 20, 100, 30);
		b2 = new JButton("Sair");
		b2.setBounds(20, 20, 100, 30);

		p1.add(b1);
		p2.add(b2);
		getContentPane().add(p1);
		getContentPane().add(p2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String [] args){
		new TesteJPanel();
	}
}