package heranca;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario contador = new Contador();
		Funcionario engenheiro = new Engenheiro();
		Contador cont = (Contador) contador;
		cont.setNumCrc("1234");
		((Contador) contador).setNumCrc(null);
	}
}
