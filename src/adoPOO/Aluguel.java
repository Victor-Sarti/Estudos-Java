package adoPOO;

public class Aluguel {
	
	 private Pessoas pessoa;
	    private String item;
	    private String dataInicio;
	    private String dataFim;

	    public Aluguel(Pessoas pessoa, String item, String dataInicio, String dataFim) {
	        this.pessoa = pessoa;
	        this.item = item;
	        this.dataInicio = dataInicio;
	        this.dataFim = dataFim;
	    }

	    public Pessoas getPessoa() {
	        return pessoa;
	    }

	    public void setPessoa(Pessoas pessoa) {
	        this.pessoa = pessoa;
	    }

	    public String getItem() {
	        return item;
	    }

	    public void setItem(String item) {
	        this.item = item;
	    }

	    public String getDataInicio() {
	        return dataInicio;
	    }

	    public void setDataInicio(String dataInicio) {
	        this.dataInicio = dataInicio;
	    }

	    public String getDataFim() {
	        return dataFim;
	    }

	    public void setDataFim(String dataFim) {
	        this.dataFim = dataFim;
	    }

	    @Override
	    public String toString() {
	        return "Aluguel{" +
	               "pessoa=" + pessoa +
	               ", item='" + item + '\'' +
	               ", dataInicio='" + dataInicio + '\'' +
	               ", dataFim='" + dataFim + '\'' +
	               '}';
	    }
	}


