package pi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Exercicio1JFrame extends JFrame {
	JLabel nome;
	JTextField txtNome;
	public Exercicio1JFrame() {
		String titulo = JOptionPane.showInputDialog("Titulo: ");
		setTitle(titulo); 
		int larg = Integer.parseInt(JOptionPane.showInputDialog("Largura: "));
		int alt = Integer.parseInt(JOptionPane.showInputDialog("Altura: "));
		setSize(larg,alt);
		setLayout(null);
		int r = Integer.parseInt(JOptionPane.showInputDialog("Vermelho de 0 a 255: "));
		int g = Integer.parseInt(JOptionPane.showInputDialog("Verde de 0 a 255: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Azul de 0 a 255: "));
		getContentPane().setBackground(new Color(r,g,b));
		nome = criarJLabel("Nome", 10, 10, 270, 40);
		txtNome = criarTexto(10, 50, 270, 40);
		centralizar();
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	
	private JTextField criarTexto(int desq, int dtopo, int larg, int alt) {
		JTextField jt = new JTextField();
		jt.setBounds(desq, dtopo, larg, alt);
		jt.setText(" ");
		jt.setHorizontalAlignment(JTextField.CENTER);
		add(jt);
		return jt;
	}
	public static void main(String[] args) {
		new Exercicio1JFrame();
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
	
	public JLabel criarJLabel(String string, int desq, int dtop, int larg, int alt){
		JLabel jl = new JLabel(string);
		jl.setText("TORCIDA JOVEM SANTOS");
		jl.setLocation(desq, dtop); //distancia esq e top
		jl.setSize(larg,alt); // larg e alt do rotulo 
		//TORNA OPCAO O FUNDO DO ROTULO 
		jl.setOpaque(true); // fundo opcao 
		jl.setBackground(new Color(0,0,0)); //cor fundo
		jl.setForeground(new Color(255,255,255)); //cor fonte 
		jl.setFont(new Font ("Courier new", Font.BOLD, 20)); //nome, estilo e tamanho da fonte
		jl.setToolTipText("JLabel Exemplo"); // dica de texto 
		jl.setHorizontalAlignment(SwingConstants.LEFT); //alinhamento horizontal 
		jl.setVerticalAlignment(SwingConstants.TOP); //alinhamento vertical
		add(jl);
		return jl;
		
	}
}
