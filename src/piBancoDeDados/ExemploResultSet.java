package piBancoDeDados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import piBancoDeDados.Aluno;
import piBancoDeDados.ConectaMySQL;

public class ExemploResultSet {
	public static void main(String[] args) {        
		try {
			ConectaMySQL conexao = new ConectaMySQL();
			Connection cn = conexao.openDB();
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Alunos");
			System.out.format("%-4S %-30S %-25S %-4S" , 
					"id", "Nome completo", "Telefone", "Nota" ); 
			System.out.print("\n-----------------------------"
					+ "--------------------------------------");
			while (rs.next()) {
				int id = rs.getInt("idalunos");
				String nome = rs.getString("alunosNome");
				String telefone = rs.getString("alunosTelefone");
				double nota = rs.getDouble("alunosNota");
				Aluno novo = new Aluno(id, nome, telefone, nota);
//								System.out.println(novo);
//				System.out.println(novo);
				novo.imprimirAluno();
			} 
			conexao.closeDB(cn, st, rs);
		} catch (SQLException e) {
			System.out.println("Falha ao realizar a operaÃ§Ã£o.");
			e.printStackTrace();        
		
		}    
		
		
	}		
	
}