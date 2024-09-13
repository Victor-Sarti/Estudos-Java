package heranca;

import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MinhaJanela extends JFrame {

	private JButton meuBotao;

	public MinhaJanela() {
		// botão
		meuBotao = new JButton("Botão");
		meuBotao.setBounds(10, 10, 150, 30);
		// adicionando componentes
		getContentPane().setLayout(null);
		getContentPane().add(meuBotao);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // comando para fechar o programa ao fechar a janela
		setBounds(100, 100, 500, 500); // comando para dar tamanho e coordenadas da janela
		setTitle("Minha Janela");
		setResizable(false); // Proibe de aumentar o tamanho da janela
		setCursor(Cursor.HAND_CURSOR); // altera o cursor para mãozinha
		setExtendedState(MAXIMIZED_BOTH); // deixa a janela na tela inteira

	}
}
