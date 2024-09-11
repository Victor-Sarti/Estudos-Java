package adoPOO;

public class Pessoa {
	   private String nome;
	    private String cpf;

	    public Pessoa(String nome, String cpf) {
	        this.nome = nome;
	        this.cpf = cpf;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getDocumentoIdentidade() {
	        return cpf;
	    }

	    public void setDocumentoIdentidade(String cpf) {
	        this.cpf = cpf;
	    }

	    @Override
	    public String toString() {
	        return "Pessoa{" +
	               "nome='" + nome + '\'' +
	               ", cpf='" + cpf + '\'' +
	               '}';
	    }
	}

