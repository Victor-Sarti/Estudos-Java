package piBancoDeDados;

import java.sql.*; 
import javax.swing.JOptionPane; 
import piBancoDeDados.Aluno;
import piBancoDeDados.ExConsultaNomeCompleto;
import piBancoDeDados.ConectaMySQL;
public class ExemploAlteracao  { 
	public static void main(String[] args) { 
		try {realizaOperacao();
		} 
		catch (Exception e) {e.printStackTrace();
		} 
	}
	private static void realizaOperacao() throws Exception {
		ConectaMySQL cm = new ConectaMySQL();
		Connection cn = cm.openDB();
		Statement st = null; try {
			st = cn.createStatement();
			String nome = JOptionPane.showInputDialog(
					"Digite o nome do aluno a ser alterado");
			ExConsultaNomeCompleto consulta = new ExConsultaNomeCompleto();
			Aluno alterado = consulta.consultarNomeCompleto(nome);
			if(consulta!=null) {
				int resp = JOptionPane.showConfirmDialog(null, 
						"Confirma a alteração do aluno: \n" + alterado);
				if (resp==0) {
					alterarAluno(alterado);
				} 
				else {
					JOptionPane.showMessageDialog(null, "O aluno: " 
							+ alterado.getNome() + " NÃO foi alterado"); 
				} } 
			else
				JOptionPane.showMessageDialog(null, "O aluno: " 
						+ alterado.getNome() + " NÃO foi encontrado"); } 
		catch (SQLException e) {
			throw new Exception("Falha ao acessar base de dados.\n" 
					+ e.getMessage());
		} finally {
			st.close();
			cn.close();
		}
	}

	public static Aluno alterarAluno(Aluno alterado) throws SQLException {
		ConectaMySQL cm = new ConectaMySQL();
		Connection con = cm.openDB();
		PreparedStatement pstm = con.prepareStatement("UPDATE alunos SET "
				+ " alunosNome=?, alunosTelefone=?, alunosNota=? WHERE idalunos=?");
		String nome = JOptionPane.showInputDialog("Digite o novo Nome: ", alterado.getNome());
		String telefone = JOptionPane.showInputDialog("Digite o telefone: ", alterado.getTelefone());
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: ", alterado.getNota()));
		pstm.setString(1, nome);pstm.setString(2, telefone);
		pstm.setDouble(3, nota);pstm.setInt(4, (int)alterado.getId());
		Aluno aposAlteracao = new Aluno((int)alterado.getId(), nome, telefone, nota);
		pstm.execute();
		JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso!!!");
		return aposAlteracao;
	}
}