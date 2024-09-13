package heranca;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaCadastro extends JFrame {
	
	private JButton btnS;
	private JButton btnE;
	private JButton btnL;
	private JLabel id;
	private JLabel name;
	public JanelaCadastro() {
		
		// botão
		btnS = new JButton("Salvar");
		btnS.setBounds(10, 10, 150, 30);
		
		// adicionando componentes
		getContentPane().setLayout(null);
		getContentPane().add(id);
		getContentPane().add(name);
		getContentPane().add(btnS);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setBounds(100, 100, 500, 500);
		setTitle("Janela Cadastro");
		
		
	}

}
