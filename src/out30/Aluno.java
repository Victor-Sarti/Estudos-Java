package out30;

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
	public Aluno(String id, String nome, String telefone) {
		this.id = Integer.parseInt(id);
		this.nome = nome;
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "ID = " + id + ", Nome = " + nome + ", Telefone = " + telefone + ", "
				+ "Nota = " + nota;
	}
	public void imprimirAluno() {
		System.out.format("\n%-4d %-30s %-25s %,4.2f", 
				getId(), getNome(), getTelefone(), getNota());
	}
	public void imprimirNomeNota() {
		System.out.format("\n%-30s %,4.2f", 
				getNome(), getNota());
	}
	public void imprimirRaNome() {
		System.out.format("\n%-4d %-30s ", 
				+getId() + getNome());
	}
	public Aluno(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}
	public Aluno(String id, String nome) {
		this.nome = nome;
		this.id = Integer.parseInt(id);
	}
	public Aluno(String nome) {
		this.nome = nome;
	}
	public String lerDados() {
		return this.getNome() + " - " + this.getNota();
	}
	@Override
	public int hashCode() {		
		return getNome().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Aluno) {
			Aluno novo = (Aluno) obj;
			if(novo.getNome().equalsIgnoreCase(this.getNome()))
					return true;
		}
		return super.equals(obj);
	}
	public void imprimirRANomeTelefone() {
		System.out.format("\n%-4s %-30s %-15s ", 
				+getId() + getNome() + getTelefone());
	} 
}


