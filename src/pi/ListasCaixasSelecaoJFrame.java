package pi;

import java.awt.*;  	
import java.awt.event.*;	
import javax.swing.*;	
import javax.swing.event.*;
public class ListasCaixasSelecaoJFrame extends JFrame 
	implements ListSelectionListener, ActionListener{  
	JLabel l1;  JTextField t1;    JButton bquant,bindice,bclear;
	JList lista; // Criando objeto Lista	
	DefaultListModel listModel; 
	public static void main(String args[]){
		new  ListasCaixasSelecaoJFrame();
	}
	public  ListasCaixasSelecaoJFrame ()	{
		setSize(400,300);
		setTitle("Usando do JList");        
		l1 = criarRotulo("Sem selecao"); 
		t1 = criarTexto();        		
		    		
		String frutas[] = {"Banana", "Pera", "Maça", "Uva" };
		listModel = criarListaModelo(frutas); //container com os itens		
		lista = criarLista(listModel); //adicionando o listModel na Lista.		
		// Criando painel do tipo barra de rolagem
		JScrollPane painel = new JScrollPane(lista); 
		setLayout(new GridLayout(6,1)); //Criando um Layout do tipo Grid 
		add(painel);		
		
		bquant = criarBotao("Quantidade de itens");        
		bindice = criarBotao("Indice selecionado");        
		bclear = criarBotao("Remove item");    
		
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private JList criarLista(DefaultListModel listModel) {
		JList lista = new JList(listModel); //adicionando o listModel na Lista.
		lista.setForeground(Color.RED);
		lista.setFont(new Font("Courier new", Font.BOLD, 18));
		lista.addListSelectionListener(this); //Adicionando o evento na lista
		return lista;
	}
	private JLabel criarRotulo(String texto) {
		JLabel jl = new JLabel(texto);
		jl.setFont(new Font("Courier new", Font.BOLD, 18));
		add(jl);	
		return jl;
	}
	private JTextField criarTexto() {
		JTextField txt = new JTextField();
		txt.setForeground(Color.BLUE);
		txt.setFont(new Font("Courier new", Font.BOLD, 18));	
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
	private DefaultListModel criarListaModelo(String[] frutas) {
		DefaultListModel lista = new DefaultListModel();		
		for (int i = 0; i < frutas.length; i++) {
			lista.addElement(frutas[i]);
		}		
		return lista;
	}
	public void actionPerformed(ActionEvent e)	{
		if (e.getSource()==t1)	{
			listModel.addElement(t1.getText());  //adiciona itens a lista
			t1.setText(""); //Limpa a caixa de texto
		} 
		if (e.getSource()==bquant)
			t1.setText("Quantidade: " + listModel.getSize());
		if (e.getSource()==bindice)
			t1.setText("Indice selecionado: " + lista.getSelectedIndex());
		if (e.getSource()==bclear)		{
			int resp = JOptionPane.showConfirmDialog(null,
				"Confirma a exclusão do item: " + lista.getSelectedValue());
			if(resp==0)			{
				int index = lista.getSelectedIndex();
				l1.setText("Removido : "+ lista.getSelectedValue());
				listModel.remove(index); 
			}	
		}        
	}
	public void valueChanged(ListSelectionEvent e){
		l1.setText("Índice Selecionado: " + lista.getSelectedValue()); 
	}
}