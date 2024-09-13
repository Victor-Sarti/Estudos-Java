package heranca;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Engenheiro();
		Funcionario f2 = new Engenheiro();
		f1.setMatricula("1234");
		f2.setMatricula("1234");
		System.out.println(f1 == f2);
	}
}
