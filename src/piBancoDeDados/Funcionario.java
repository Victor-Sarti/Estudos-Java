package piBancoDeDados;

public class Funcionario {
	private int id;
	private String nome, setor;
	private int idade;
	public Funcionario() {
	}
	public Funcionario(String nome, String setor, int idade) {
		this.nome = nome;
		this.setor = setor;
		this.idade = idade;
	}
	public Funcionario(int id, String nome, String setor, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.setor = setor;
		this.idade = idade;
	}
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
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "ID = " + id + ", Nome = " + nome + ", "
				+ "Setor = " + setor + ", Idade = " + idade;
	}
}
