package adoPIIV;

import javax.swing.JOptionPane;

public class TesteUtilitaria {

	public static void main(String[] args) {
		boolean continuar = true;

        while (continuar) {
            String[] opcoes = {"CNPJ", "CPF", "Inscrição Estadual (IE)", "RG", "Sair"};
            String escolha = (String) JOptionPane.showInputDialog(null,
                    "Escolha o documento que deseja validar:",
                    "Validação de Documentos",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    "CNPJ");

            if (escolha == null || escolha.equals("Sair")) {
                JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                continuar = false;
                break;  // Encerra o laço
            }

            String documento = JOptionPane.showInputDialog("Digite o " + escolha + " para validar:");

            if (documento != null && !documento.trim().isEmpty()) {
                boolean valido = false;
                switch (escolha) {
                    case "CNPJ":
                        valido = Utilitaria.validarCNPJ(documento);
                        break;
                    case "CPF":
                        valido = Utilitaria.validarCPF(documento);
                        break;
                    case "Inscrição Estadual (IE)":
                        valido = Utilitaria.validarIE(documento);
                        break;
                    case "RG":
                        valido = Utilitaria.validarRGSaoPaulo(documento);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                        break;
                }

                String mensagem = valido ? escolha + " válido!" : escolha + " inválido!";
                JOptionPane.showMessageDialog(null, mensagem);
            } else {
                JOptionPane.showMessageDialog(null, "Documento não informado.");
            }

            // Perguntar se deseja continuar
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja validar outro documento?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (resposta != JOptionPane.YES_OPTION) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "Encerrando o programa.");
            }
        }
    }
}