package pi;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TimesQueTorce extends JFrame implements ActionListener {
	JLabel l1;
	JButton bSelecionados, bClear;
	JCheckBox cbSantos, cbCorinthians, cbPalmeiras, cbSaoPaulo;

	public static void main(String args[]) {
		new TimesQueTorce();
	}

	public TimesQueTorce() {
		setSize(400, 300);
		setTitle("Seleção de Times");

		// Labels
		l1 = criarRotulo("Nenhum time selecionado");

		// Checkboxes
		cbSantos = criarCheckBox("Santos");
		cbCorinthians = criarCheckBox("Corinthians");
		cbPalmeiras = criarCheckBox("Palmeiras");
		cbSaoPaulo = criarCheckBox("São Paulo");

		// Botões
		bSelecionados = criarBotao("Mostrar Selecionados");
		bClear = criarBotao("Limpar Seleções");

		// Layout
		setLayout(new GridLayout(7, 1));
		add(cbSantos);
		add(cbCorinthians);
		add(cbPalmeiras);
		add(cbSaoPaulo);
		add(bSelecionados);
		add(bClear);
		add(l1);

		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// Método para criar um JCheckBox
	private JCheckBox criarCheckBox(String time) {
		JCheckBox cb = new JCheckBox(time);
		cb.setFont(new Font("Courier new", Font.BOLD, 18));
		cb.setForeground(Color.BLACK);
		add(cb);
		return cb;
	}

	// Método para criar um JLabel
	private JLabel criarRotulo(String texto) {
		JLabel jl = new JLabel(texto);
		jl.setFont(new Font("Courier new", Font.BOLD, 18));
		add(jl);
		return jl;
	}

	// Método para criar um JButton
	private JButton criarBotao(String texto) {
		JButton botao = new JButton(texto);
		botao.addActionListener(this);
		botao.setFont(new Font("Courier new", Font.BOLD, 18));
		botao.setForeground(Color.BLACK);
		add(botao);
		return botao;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Quando o botão de mostrar selecionados é pressionado
		if (e.getSource() == bSelecionados) {
			StringBuilder timesSelecionados = new StringBuilder("Times Selecionados: ");

			// Verifica quais caixas de seleção foram marcadas
			if (cbSantos.isSelected()) timesSelecionados.append("Santos ");
			if (cbCorinthians.isSelected()) timesSelecionados.append("Corinthians ");
			if (cbPalmeiras.isSelected()) timesSelecionados.append("Palmeiras ");
			if (cbSaoPaulo.isSelected()) timesSelecionados.append("São Paulo ");

			if (timesSelecionados.toString().equals("Times Selecionados: ")) {
				timesSelecionados = new StringBuilder("Nenhum time selecionado");
			}

			l1.setText(timesSelecionados.toString());
		}

		// Quando o botão de limpar seleções é pressionado
		if (e.getSource() == bClear) {
			cbSantos.setSelected(false);
			cbCorinthians.setSelected(false);
			cbPalmeiras.setSelected(false);
			cbSaoPaulo.setSelected(false);
			l1.setText("Nenhum time selecionado");
		}
	}
}


