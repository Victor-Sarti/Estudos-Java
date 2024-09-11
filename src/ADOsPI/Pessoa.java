package ADOsPI;

public class Pessoa {

	private String sexo;
	public static final int MASCULINO = 1;
	public static final int FEMININO = 2;

	public Pessoa() {
		super();
	}

	public  Pessoa(int s) {
		setSexo(s);
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(int s) {
		if (s == MASCULINO) {
			sexo = "Masculino";
		} else if (s == FEMININO) {
			sexo = "Feminino";
		}
	}

	public static int getMasculino() {
		return MASCULINO;
	}

	public static int getFeminino() {
		return FEMININO;
	}

	@Override
	public String toString() {
		return "Pessoa [sexo=" + sexo + ", getSexo()=" + getSexo() + "]";
	}
}
