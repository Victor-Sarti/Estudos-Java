package estruturaDados;

import javax.swing.JOptionPane;

public class TesteTarefaObject {

    public static void main(String[] args) {
        VetorTarefasObject vetor = new VetorTarefasObject(3);
        boolean continuar = true; // Inicializa a variável continuar como true

        do {
            String[] opcoes = {"Adicionar Tarefa", "Adicionar Tarefa no Início", "Buscar Tarefa", "Remover Tarefa", "Listar Tarefas", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Gerenciador de Tarefas",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0: // Adicionar Tarefa
                    String tarefaAdicionar = JOptionPane.showInputDialog("Insira a Tarefa");
                    try {
                        vetor.adiciona(tarefaAdicionar);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro ao adicionar tarefa: " + e.getMessage());
                    }
                    break;
                case 1: // Adicionar Tarefa no Início
                    try {
                        int posicaoInicio = Integer.parseInt(JOptionPane.showInputDialog("Insira a Posição"));
                        String tarefaAdicionarInicio = JOptionPane.showInputDialog("Insira a Tarefa");
                        vetor.adiconaInicio(posicaoInicio, tarefaAdicionarInicio);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Posição inválida. Informe um número.");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro ao adicionar tarefa no início: " + e.getMessage());
                    }
                    break;
                case 2: // Buscar Tarefa
                    try {
                        int posicaoBuscar = Integer.parseInt(JOptionPane.showInputDialog("Insira a Posição"));
                        JOptionPane.showMessageDialog(null, vetor.busca(posicaoBuscar));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Posição inválida. Informe um número.");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro ao buscar tarefa: " + e.getMessage());
                    }
                    break;
                case 3: // Remover Tarefa
                    try {
                        int posicaoRemover = Integer.parseInt(JOptionPane.showInputDialog("Insira a Posição"));
                        vetor.remove(posicaoRemover);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Posição inválida. Informe um número.");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro ao remover tarefa: " + e.getMessage());
                    }
                    break;
                case 4: // Listar Tarefas
                    JOptionPane.showMessageDialog(null, vetor.listar());
                    break;
                case 5: // Sair
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    // Não muda o valor de continuar, então o loop continua
            }
        } while (continuar);
    }
}
