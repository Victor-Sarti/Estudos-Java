package piBancoDeDados;

public class Aluno {
	private int id;
	private String nome, telefone;
	private double nota;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public Aluno() {
	}
	public Aluno(String nome, String telefone, double nota) {
		this.nome = nome;
		this.telefone = telefone;
		this.nota = nota;
	}
	public Aluno(int id, String nome, String telefone, double nota) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "ID = " + id + ", Nome = " + nome + ", Telefone = " + telefone + ", "
				+ "Nota = " + nota;
	}
}