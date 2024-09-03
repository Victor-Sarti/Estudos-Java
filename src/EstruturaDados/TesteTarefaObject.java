package EstruturaDados;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteTarefaObject{
public static void main(String[] args) throws Exception {
	VetorTarefasObject vetor = new VetorTarefasObject(3);
	Scanner s = new Scanner(System.in);
	
	 try {
         for (int i = 0; i < 3; i++) { // Adiciona três tarefas para testar
             String tarefa = JOptionPane.showInputDialog("Insira a Tarefa");
             vetor.adiciona(tarefa);
             
         }
     } catch (Exception e) {
         e.printStackTrace();
     }

     // Exibe a lista de tarefas
     JOptionPane.showMessageDialog(null, vetor.listar());
 }
}