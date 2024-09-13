package heranca;

public class Contador extends Funcionario {
	public Contador() {
		System.out.println("Passou pelo Contador");
	}
	
	private String numCrc;

	public String getNumCrc() {
		return numCrc;
	}

	public void setNumCrc(String numCrc) {
		this.numCrc = numCrc;
	}

}
