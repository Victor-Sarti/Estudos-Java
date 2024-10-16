package piBancoDeDados;
import java.sql.*;

import javax.swing.*;
public class ExemploCadastro {
	public static void main(String[] args) {        
		try {
			ConectaMySQL conexao = new ConectaMySQL();
			Connection cn = conexao.openDB();
			PreparedStatement ps = cn.prepareStatement("INSERT INTO Alunos " +
					"(alunosNome, alunosTelefone, alunosNota)" + "VALUES (?, ?, ?)"); 
			ps.setString(1, JOptionPane.showInputDialog("Nome:", "Marcela Souza"));//nome
			ps.setString(2, JOptionPane.showInputDialog("Telefone:" , "(11)98585-5566"));//tel
			ps.setDouble(3,Double.parseDouble(JOptionPane.showInputDialog(
					"Nota:", 9.9)));//nota
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
			conexao.closeDB(cn, ps, null);
//			System.out.println("ConexÃ£o encerrada.");            
		} catch (SQLException e) {
			System.out.println("Falha ao realizar a operaÃ§Ã£o.");
			e.printStackTrace();
		}    
	}		

}
