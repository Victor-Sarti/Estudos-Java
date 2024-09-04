package PI;

import javax.swing.JOptionPane;

public class TesteCadastrarFornecedor {
	public static void main(String[] args) {
		
		String valores[] = { "Pessoa", "Empresa" };
		String continuar;
		do {
		Object escolha = JOptionPane.showInputDialog(null, "Qual Fornecedor deseja Cadastrar?", "Cadastro de Pessoa", 3,
				null, valores, valores[0]);
		HerancaFornecedor f = null;
		if (escolha.equals("Pessoa")) {
			String cpf, rg;
			cpf = JOptionPane.showInputDialog("Digite o CPF ");
			
			f = new FornecedorPessoa(JOptionPane.showInputDialog("Digite o Nome da Pessoa"),
					JOptionPane.showInputDialog("Digite o Telefone "), cpf,
					JOptionPane.showInputDialog("Digite o RG "));
		} else if (escolha.equals("Empresa")) {
			f = new FornecedorEmpresa(JOptionPane.showInputDialog("Digite o Nome da Empresa"),
					JOptionPane.showInputDialog("Digite o Telefone "), JOptionPane.showInputDialog("Digite o CNPJ "),
					JOptionPane.showInputDialog("Digite a IE "));
		}
		JOptionPane.showConfirmDialog(null, f);
		 continuar = JOptionPane.showInputDialog("Deseja cadastrar outro fornecedor? (sim/não)");
        } while (continuar.equalsIgnoreCase("sim"));
		 JOptionPane.showMessageDialog(null, "Cadastro de fornecedores concluído.");
	}
}