package pi;

import java.awt.*;
import javax.swing.*;

public class TesteGridLayout extends JFrame {
	public TesteGridLayout() {
		setTitle("Teste GridLayout");
		setSize(300, 150);
		getContentPane().setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		GridLayout gl = new GridLayout(3, 2, 10, 10);
		getContentPane().setLayout(gl);
		JButton b1 = criarBotao("Linha 1 - Coluna 1");
		JButton b2 = criarBotao("Linha 1 - Coluna 2");
		JButton b3 = criarBotao("Linha 2 - Coluna 1");
		JButton b4 = criarBotao("Linha 2 - Coluna 2");
		JButton b5 = criarBotao("Linha 3 - Coluna 1");
		JButton b6 = criarBotao("Linha 3 - Coluna 2");
		setVisible(true);
	}

	private JButton criarBotao(String texto) {
		JButton botao = new JButton(texto);
		add(botao);
		return botao;
	}

	public static void main(String[] args) {
		new TesteGridLayout();
	}
}