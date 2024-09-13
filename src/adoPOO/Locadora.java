package adoPOO;
//VICTOR GABRIEL SARTI MIRANDA 
// JUAN MAICON ANDRADE SANTOS 
	import java.util.ArrayList;
	import java.util.List;

	public class Locadora {
	    private String nome;
	    private List<Aluguel> alugueis;

	    public Locadora(String nome) {
	        this.nome = nome;
	        this.alugueis = new ArrayList<>();
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public List<Aluguel> getAlugueis() {
	        return alugueis;
	    }

	    public void adicionarAluguel(Aluguel aluguel) {
	        this.alugueis.add(aluguel);
	    }

	    @Override
	    public String toString() {
	        return "Locadora{" +
	               "nome='" + nome + '\'' +
	               ", alugueis=" + alugueis +
	               '}';
	    }
	}
