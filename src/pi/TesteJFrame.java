package pi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TesteJFrame extends  JFrame {
	JLabel nome;
	public TesteJFrame() {
		setTitle("Primeira Janela Swing");//titulo da janela 
		setSize(375,100);
		getContentPane().setLayout(null);//anula o layout
		//cor de fundo da janela no padrao RGB 
		getContentPane().setBackground(new Color(96,96,96));
		setVisible(true);//exibindo a janela 
		//provoca o termino da execucao
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centralizar();
		nome = criarJLabel("nome");
	}
	public static void main(String[] args) {
		new TesteJFrame();
	}
	
	public void centralizar() {
		//obtem a altura e largura da resolucao video 
		Dimension screen =
				Toolkit.getDefaultToolkit().getScreenSize();
		//obtem a altura e largura da minha janela 
		Dimension janela = getSize();
		
		if(janela.height > screen.height)
			setSize(janela.width, screen.height);
		if(janela.width > screen.width)
			setSize(screen.width, janela.height);
		
		setLocation((screen.width - janela.width)/2,
				(screen.height - janela.height)/2);
	}
	
	public JLabel criarJLabel(String string){
		JLabel jl = new JLabel(string);
		jl.setText("JLabel inserindo");
		jl.setLocation(10, 10); //distancia esq e top
		jl.setSize(370,50); // larg e alt do rotulo 
		//TORNA OPCAO O FUNDO DO ROTULO 
		jl.setOpaque(true); // fundo opcao 
		jl.setBackground(new Color(255,255,255)); //cor fundo
		jl.setForeground(new Color(0,0,0)); //cor fonte 
		jl.setFont(new Font ("Courier new", Font.BOLD, 12)); //nome, estilo e tamanho da fonte
		jl.setToolTipText("JLabel Exemplo"); // dica de texto 
		jl.setHorizontalAlignment(SwingConstants.LEFT); //alinhamento horizontal 
		jl.setVerticalAlignment(SwingConstants.TOP); //alinhamento vertical
		add(jl);
		return jl;
		
	}

}
