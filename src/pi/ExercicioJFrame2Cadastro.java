package pi;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ExercicioJFrame2Cadastro extends JFrame implements ActionListener {

	JLabel cpf, nome;
	JTextField txtCpf, txtNome;
	JButton btnGravar, btnSair;

	public ExercicioJFrame2Cadastro() {
		//Selecionando a Paleta de cores no swing
				Color c = JColorChooser.showDialog(null,  
						"Escolha uma cor", Color.lightGray);
				getContentPane().setBackground(c);
		
		setTitle("Primeira Janela Swing");// Titulo da janela
		setSize(600, 400); // tamanho da janela
		setLayout(null);// anula o layout padrao
		int alt = 40;
		cpf = criarJLabel("CPF:", 10, 10, 270, alt);
		nome = criarJLabel("NOME:", 10, 95, 270, alt);

		txtCpf = criarTexto(10, 50, 270, alt);
		txtNome = criarTexto(10, 132, 270, alt);
		int rodape = getHeight() - 80;
		int distEsq = getWidth() / 2;
		int larg = 150;
		btnGravar = criarBotao("Gravar", 'G', distEsq - larg, rodape, larg, alt);
		btnSair = criarBotao("Sair", 'S', distEsq, rodape, larg, alt);
		centralizar();
		setVisible(true);// Exibindo a janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private JButton criarBotao(String string, char c, int distEsq, int rodape, int larg, int altura) {
		JButton b1 = new JButton(string);
		b1.setBounds(distEsq, rodape, larg, altura); // D Esq, D Topo, larg, alt
		b1.setBackground(new Color(0, 0, 170));
		b1.setForeground(Color.YELLOW);
		b1.setFont(new Font("Helvetica", Font.BOLD, 18));
		b1.setToolTipText("Botão " + string);
		b1.setHorizontalAlignment(0);
		b1.setVerticalAlignment(0);
//	b1.setEnabled(false); //Botão desabilitado.
		b1.setMnemonic(c); // Tecla de atalho
		b1.addActionListener(this);
		add(b1);
		return b1;
	}

	private JTextField criarTexto(int desq, int dtopo, int larg, int alt) {
		JTextField jt = new JTextField();
		jt.setBounds(desq, dtopo, larg, alt);
		jt.setForeground(Color.blue);
//	jt.setText("Insira texto aqui");
//	jt.setHorizontalAlignment(4);
		add(jt);
		return jt;
	}

	public JLabel criarJLabel(String string, int desq, int dtopo, int larg, int alt) {
		JLabel jl = new JLabel(string);
//	jl.setText("JLabel inserido");
		jl.setLocation(desq, dtopo); // dist esq e topo
		jl.setSize(larg, alt); // larg e alt do rótulo
//	jl.setOpaque(true);		//fundo opcao
//	jl.setBackground(new Color(255,255,255)); //cor fundo
		jl.setForeground(new Color(255, 255, 255)); // cor fonte
		jl.setFont(new Font("Courier new", Font.BOLD, 18));// nome, estilo e tamanho da fonte
//	jl.setToolTipText("JLabel Exemplo"); //dica de texto
//	jl.setHorizontalAlignment(SwingConstants.LEFT);//alinhamento horizontal
//	jl.setVerticalAlignment(SwingConstants.TOP);//alinhamento vertical
		add(jl);
		return jl;
	}

	public static void main(String[] args) {
		new ExercicioJFrame2Cadastro();
	}

	public void centralizar() {
		Dimension screen = // obtém a altura e largura da resolução vídeo
				Toolkit.getDefaultToolkit().getScreenSize();
		Dimension janela = getSize();// obtém a altura e largura da minha janela
		if (janela.height > screen.height)
			setSize(janela.width, screen.height);
		if (janela.width > screen.width)
			setSize(screen.width, janela.height);
		setLocation((screen.width - janela.width) / 2, (screen.height - janela.height) / 2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSair)
			System.exit(0);
	}

}