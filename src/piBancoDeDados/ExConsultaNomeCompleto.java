package piBancoDeDados;

import java.sql.*;
import java.text.*;
import javax.swing.JOptionPane;
import piBancoDeDados.Aluno;
import piBancoDeDados.ConectaMySQL;
import java.util.Date;

public class ExConsultaNomeCompleto {
	public static void main(String[] args) throws Exception {
		Aluno aluno = new ExConsultaNomeCompleto()
				.consultarNomeCompleto(JOptionPane.showInputDialog("Digite o nome a ser consultado", "Marcela Maria"));
		System.out.println("Data e Hora da consulta: " + lerHora());
		if (aluno != null)
			System.out.println(aluno);
		else
			System.out.println("Aluno não encontrado");
	}

	public static String lerHora() {
		DateFormat dia = new SimpleDateFormat("dd/MM/YYYY");
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		return dia.format(date) + " - " + dateFormat.format(date);
	}

	Aluno consultarNomeCompleto(String nome) throws Exception {
		Aluno novo = null;
		String queryCmd = "select * from alunos where alunosNome like ?";
		Connection con = null;
		ConectaMySQL conexao = null;
		try {
			conexao = new ConectaMySQL();// VER
			con = conexao.openDB();
			PreparedStatement ps1 = con.prepareStatement(queryCmd);
			ps1.setString(1, (nome != null ? nome.trim() : ""));
			ResultSet rs = ps1.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("idAlunos");
				String nom = rs.getString("alunosNome");
				String tel = rs.getString("alunosTelefone");
				Double nota = rs.getDouble("alunosNota");
				novo = new Aluno(id, nom, tel, nota);
			}
		} catch (SQLException e) {
			throw new Exception(e);
		} finally {
			conexao.closeDB();
		}
		return novo;
	}
}