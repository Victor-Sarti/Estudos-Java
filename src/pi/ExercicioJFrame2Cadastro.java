package pi;

import java.awt.Color;	
import java.awt.Font;	
import java.awt.event.ActionEvent;	
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


public class ExercicioJFrame2Cadastro extends JFrame implements ActionListener, ItemListener {

	JLabel cpf, rg, nome, logradouro, endereco;
	JTextField txtCpf, txtRg, txtNome, txtEndereco;
	JButton btGravar, btCancelar;
	JComboBox combo;
	
	public ExercicioJFrame2Cadastro() {
		setTitle("Cadastro");		
		setSize(800,400);					
		getContentPane().setLayout(null);		
		int distTopo=10;	
		int linha=40;	
		
		String[] logr = {"Alameda","Avenida","Praça","Rodovia","Rua","Viela"}; 
		combo = criarCombo(logr);
		
		Color c = JColorChooser.showDialog(null,  
				"Escolha uma cor", Color.lightGray);
		getContentPane().setBackground(c);
		
		//1ª linha
		cpf = criarJLabel("CPF", 10, distTopo, 100, linha);	
		txtCpf = criarTexto(110, distTopo, 250, linha);
		rg = criarJLabel("RG", 460, distTopo, 100, linha);	
		txtRg = criarTexto(490, distTopo, 265, linha);
		//2ª linha	distTopo+=50
		nome = criarJLabel("NOME", 10, distTopo+=50, 100, linha);
		txtNome = criarTexto(110, distTopo, 650, linha);
		
		//3ª linha 	distTopo+=50
		logradouro = criarJLabel("Logradouro", 10, distTopo+=50, 130, linha);
		
		endereco = criarJLabel("Endereço", 250, distTopo, 130, linha);
		txtEndereco = criarTexto(390, distTopo, 360, linha);				
		
		//Botões 	rodape
		int rodape = 300;
		int centro = 800/2;
		btGravar = criarBotao("Gravar", 'G', 300, rodape, 130, linha);
		btCancelar = criarBotao("Cancelar", 'C', 430, rodape, 130, linha);		
		
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private JComboBox criarCombo(String[] cores) {
		JComboBox combo = new JComboBox(cores); 
		combo.addItemListener(this); 
		combo.setFont(new Font("Arial", Font.BOLD, 15));
		combo.setBounds(140, 110, 100, 40);
		add(combo);
		return combo;
	}
	private JButton criarBotao(String texto, char atalho,
			int dEsq, int rodape, int larg, int linha) {
		JButton botao = new JButton(texto);
		botao.setBounds(dEsq, rodape, larg, linha);
		botao.setMnemonic(atalho);
		botao.setBackground(new Color(0,0,170));
		botao.setForeground(Color.YELLOW);
		botao.setFont(new Font("Helvetica", Font.BOLD, 18));
		botao.setToolTipText("Botão " + texto);
		botao.addActionListener(this);
		add(botao);
		return botao;
	}
	
	public JTextField criarTexto(int distEsq, 
			int distTopo, int larg, int altura) {
		JTextField txt = new JTextField();
		txt.setBounds(distEsq, distTopo, larg, altura);
		txt.setForeground(Color.BLUE);
		txt.setFont(new Font("Courier new", Font.BOLD, 18));	
		add(txt);	//adiciona o componente na tela	
		return txt;
	}
	public  JLabel criarJLabel(String texto, int distEsq, 
			int distTopo, int larg, int altura){
		JLabel jl = new JLabel(texto);
		jl.setBounds(distEsq, distTopo, larg, altura);
		jl.setFont(new Font("Courier new", Font.BOLD, 18));
		add(jl);	//adiciona o componente na tela	
		return jl;		
	}
	public static void main(String[] args) {
		new ExercicioJFrame2Cadastro();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btCancelar)	
			System.exit(0);		
		
	else if(e.getSource()==btGravar)	
		JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!!!");	
	}
	public void itemStateChanged(ItemEvent e) {
			JOptionPane.showMessageDialog(null, "Selecionado: " 
					+ combo.getSelectedItem());		 
	}
	
}