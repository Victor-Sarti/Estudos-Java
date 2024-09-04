package PI;

import javax.swing.JOptionPane;

public class TesteCadastrarFornecedor {
	public static void main(String[] args) {
		int resp = 0;
		do {
			int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade a cadastrar:"));

			HerancaFornecedor f[] = new HerancaFornecedor[qtd];

			for (int i = 0; i < qtd; i++) {
				String valores[] = { "Pessoa", "Empresa" };
				Object escolha = JOptionPane.showInputDialog(null, "Qual Pessoa deseja Cadastrar?",
						"Cadastro de Fornecedor", JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
				if (escolha.equals("Pessoa")) {
					String cpf, rg;
					cpf = JOptionPane.showInputDialog("Digite o CPF ");
					rg = JOptionPane.showInputDialog("Digite o RG ");
					f[i] = new FornecedorPessoa(JOptionPane.showInputDialog("Digite o Nome da Pessoa"),
							JOptionPane.showInputDialog("Digite o Telefone "), cpf, rg);
				} else if (escolha.equals("Empresa")) {
					f[i] = new FornecedorEmpresa(JOptionPane.showInputDialog("Digite o Nome da Empresa"),
							JOptionPane.showInputDialog("Digite o Telefone "),
							JOptionPane.showInputDialog("Digite o CNPJ "), JOptionPane.showInputDialog("Digite a IE "));
				}
			}

			for (int i = 0; i < qtd; i++) {
				System.out.println(f[i]);
			}
			resp = JOptionPane.showConfirmDialog(null, "Cadastrar Outros?");
		} while (resp == 0);
	}
}