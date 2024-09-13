package heranca;

public class Engenheiro extends Funcionario {

	
	public Engenheiro() {
		System.out.println("Passou pelo engenheiro");
	}
	private String numCrc;

	public String getNumCrc() {
		return numCrc;
	}

	public void setNumCrc(String numCrc) {
		this.numCrc = numCrc;
	}

}
