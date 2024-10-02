package pi;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ExComboBox extends JFrame implements ActionListener, ItemListener{
	JLabel l1;
	JTextField t1,t2,t3;
	JComboBox combo;
	JButton b1,b2,b3,b4,b5,b6; 
	public static void main(String args[]){
		new ExComboBox(); 
	}
	ExComboBox () {
		setTitle("Uso do JComboBox"); setSize(400,170); 
		String[] cores = {"Branco","Vermelho","Azul","Verde"}; 
		getContentPane().setBackground(new Color(190,190,190));
		getContentPane().setLayout(new GridLayout(5,2)); 

		l1 = criarRotulo("Conteudo"); combo = criarCombo(cores);
		b1 = criarBotao("Mostra Texto"); b4 = criarBotao("Remove Item");
		b2 = criarBotao("Mostra Índice"); b5 = criarBotao("Remove Todos");
		b3 = criarBotao("Adiciona Item"); t1 = criarTexto(); 
		b6 = criarBotao("Quant. Itens"); t2 = criarTexto(); 
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private JComboBox criarCombo(String[] cores) {
		JComboBox combo = new JComboBox(cores); 
		combo.addItemListener(this); 
		combo.setFont(new Font("Arial", Font.BOLD, 15));
		add(combo);
		return combo;
	}
	private JLabel criarRotulo(String string) {
		JLabel l1 = new JLabel(string); 
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setForeground(Color.blue); 
		l1.setFont(new Font("Arial", Font.BOLD, 15));
		add(l1);
		return l1;
	}
	private JTextField criarTexto() {
		JTextField txt = new JTextField();
		txt.setForeground(Color.RED);
		txt.setFont(new Font("Courier new", Font.BOLD, 18)); 
		txt.setHorizontalAlignment(SwingConstants.CENTER); 
		txt.addActionListener(this);
		add(txt); 
		return txt;
	}
	private JButton criarBotao(String texto) {
		JButton botao = new JButton(texto);
		botao.addActionListener(this); 
		botao.setFont(new Font("Courier new", Font.BOLD, 18));
		botao.setForeground(Color.BLUE);
		add(botao);
		return botao;
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==b1)
			l1.setText("Texto: "+combo.getSelectedItem());
		if (e.getSource()==b2)
			l1.setText("Índice: " + combo.getSelectedIndex()); 
		if (e.getSource()==b3)
			if (t1.getText().length()!=0){
				combo.addItem(t1.getText());//adiciona item
				t1.setText(""); 
			}
		if (e.getSource()==b4)
			combo.removeItemAt( (combo.getSelectedIndex())); // remove o item selecionado
		if (e.getSource()==b5)
			combo.removeAllItems(); //remove todos itens 
		if (e.getSource()==b6) 
			t2.setText(""+combo.getItemCount()); 
	} //conta a quantidade total de itens
	public void itemStateChanged(ItemEvent e) { 
		t1.setText(""+combo.getSelectedItem()); 
	} 
}