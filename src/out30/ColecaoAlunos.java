package out30;



import java.util.*;
import javax.swing.JOptionPane;
public class ColecaoAlunos {
	public static void main(String[] args) {
		List alunos = new ArrayList<Aluno>();
		do {
			
			String nome = JOptionPane.showInputDialog(
					"Digite o nome do Aluno:", "Marcos");
			double nota = Double.parseDouble(JOptionPane
					.showInputDialog("Digite a nota:", "8.7"));
			Aluno novo = new Aluno(nome , nota);
			alunos.add(novo);			
		}while(JOptionPane.showConfirmDialog(null, "Cadastrar Outro?")==0);		

		imprimeAlunos(alunos);		
		Collections.sort(alunos);
		
		System.out.println("Após a ordenação: ");
		for (Object aluno : alunos) {
			System.out.println(aluno);
		}	

		//removendo
		String nome = JOptionPane.showInputDialog(
				"Digite o nome do aluno a ser removido", "marcos");
		Aluno removido = new Aluno(nome);
		int indice = -1;
		if(alunos.contains(removido))	{		
			indice = alunos.indexOf(removido);
			Aluno removido2 = (Aluno) alunos.remove(indice);
			JOptionPane.showMessageDialog(
					null, "Aluno removido do indice: " 
					+ indice + "\nDados: " + removido2.lerDados());
		}
		else			
			JOptionPane.showMessageDialog(null,  
					"Aluno " + nome + "não encontrado: ");			
		imprimeAlunos(alunos);		
	}	
	private static void imprimeAlunos (List<Aluno> alunos){
		Aluno aluno;
		System.out.println("Qtde de alunos: " + alunos.size());

		for (int nCont = 0; nCont < alunos.size(); nCont++){
			aluno = (Aluno) alunos.get(nCont);
			aluno.imprimirNomeNota();
		}
		System.out.println("\n--------FIM---------");
	}	
	public static String[][] lerDados(){
		String dados[][] = {{"Matheus","9.2"},{"Maria", "9.4"}, {"Marcos", "7.7"},{"Noá", "8.7"}};
		return dados;
	}
}

