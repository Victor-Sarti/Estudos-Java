package pi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ExCadastrarAluno extends JFrame implements ActionListener{
	private JLabel ra, nome, telefone, cep, nota1, nota2;
	private JTextField txtRa, txtNome, txtTelefone, txtCep, txtNota1, txtNota2;
	JButton btGravar, btImprimir, btSair;
	
	Aluno aluno = null;
	
	public ExCadastrarAluno() {
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		setSize((int)(tela.getWidth()/2) , (int)(tela.getHeight()/2));
		setTitle("Cadastro de Alunos");
		getContentPane().setBackground(new Color(0,0,0));
		GridLayout gl = new GridLayout(8,2,0,0);
		getContentPane().setLayout(gl);
		
		ra = criarJLabel("RA");		
		txtRa = criarTexto();
		nome = criarJLabel("Nome");		
		txtNome = criarTexto();
		telefone = criarJLabel("Telefone");		
		txtTelefone = criarTexto();
		cep = criarJLabel("CEP");		
		txtCep = criarTexto();
		nota1 = criarJLabel("Nota 1");		
		txtNota1 = criarTexto();
		nota2 = criarJLabel("Nota 2");		
		txtNota2 = criarTexto();
		btGravar = criarBotao("Gravar");
		btImprimir = criarBotao("Imprimir");
		btSair = criarBotao("Sair");		
		preencherCampos();
		
		
		setVisible(true);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
	
	private void preencherCampos() {
		txtRa.setText("1");
		txtNome.setText("Marcos Monteiro");
		txtTelefone.setText("(11)98989-7878");
		txtCep.setText("06054-000");
		txtNota1.setText("7.77");
		txtNota2.setText("7.777");		
	}

	public static void main(String[] args) {
		new ExCadastrarAluno();
	}
	public JLabel criarJLabel(String texto){
		JLabel jl = new JLabel(texto);			
		jl.setForeground(Color.BLUE);
		jl.setFont(new Font("Courier new", Font.BOLD, 16));
		add(jl);
		return jl;
	}
	public JTextField criarTexto() {
		JTextField jt = new JTextField();
		jt.setForeground(Color.blue);
		jt.setFont(new Font("Times new roman", Font.BOLD, 16));		
		add(jt);
		return jt;
	}
	public JButton criarBotao(String texto) {
		JButton b1 = new JButton(texto);
		b1.setForeground(Color.RED);
		b1.addActionListener(this);
		add(b1);
		return b1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btGravar) {
			gravarAluno();
			JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!!");
			limparCampos();
		}
		else if(e.getSource()==btImprimir) {
			System.out.println(aluno);
			limparCampos();
		}
		else if(e.getSource()==btSair) {
			int resp = JOptionPane.showConfirmDialog(null, "Confirma o encerramento?");
			if(resp==0)
				System.exit(0);
		}		
	}
	private void gravarAluno() {		
		String ra = txtRa.getText();
		String nome = txtNome.getText();
		String telefone = txtTelefone.getText();
		String cep = txtCep.getText();
		double nota1 = Double.parseDouble(txtNota1.getText());
		double nota2 = Double.parseDouble(txtNota2.getText());
		aluno = new Aluno(ra, nome, telefone, cep, nota1, nota2);		
	}
	private void limparCampos() {
		txtCep.setText("");
		txtNome.setText("");
		txtNota1.setText("");
		txtNota2.setText("");
		txtRa.setText("");
		txtTelefone.setText("");		
	}
}	
