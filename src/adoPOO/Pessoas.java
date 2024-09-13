package adoPOO;
//VICTOR GABRIEL SARTI MIRANDA 
// JUAN MAICON ANDRADE SANTOS 
public class Pessoas {
	   private String nome;
	    private String cpf;

	    public Pessoas(String nome, String cpf) {
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

